package org.merideum.kotlin.merit.interpreter.visitors

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.maps.shouldHaveSize
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty
import io.kotest.matchers.types.shouldBeTypeOf
import io.mockk.every
import io.mockk.mockk
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.error.IdentifierAlreadyDeclaredException
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser

class MeritVisitorTests: DescribeSpec({
  lateinit var resourceResolver: ResourceResolver

  class TestResource<T>(override val name: String, override val path: String, override val value: T?) : Resource<T> {
    override fun callFunction(functionName: String, parameters: List<*>): Any? {
      return null
    }

    override fun get(): T? {
      return value
    }
  }

  beforeAny {
    resourceResolver = mockk()
  }

  fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(null, mutableMapOf()),
    outputContainer: OutputContainer = OutputContainer.empty()
  ): OutputContainer {
    val lexer = MeritLexer(CharStreams.fromString(code))
    val parser = MeritParser(CommonTokenStream(lexer))

    parser.buildParseTree = true

    val parseTree = parser.parse()

    val visitor = MeritVisitor(variableScope, outputContainer, resourceResolver)

    visitor.visit(parseTree)

    return outputContainer
  }

  describe("variable declaration") {
    describe("const") {
      var code = """
        |const test = 123
      """.trimMargin()

      it("should parse successfully and run") {
        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value!!.get() shouldBe 123
            actualConst.modifier shouldBe Modifier.CONST
          }
        }
      }

      it("should reject re-assignment") {
        code = """
          |const test = 123
          |test = 456
        """.trimMargin()
        val variableScope = VariableScope(null, mutableMapOf())

        shouldThrow<IdentifierAlreadyDeclaredException> {
          executeCode(code, variableScope)
        }

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value!!.get() shouldBe 123
            actualConst.modifier shouldBe Modifier.CONST
          }
        }
      }

      it("should reject declaration without assignment") {
        code = """
          |const test
          |
        """.trimMargin()
        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should not have any variables") {
            shouldBeEmpty()
          }
        }
      }
    }

    describe("var") {
      var code = """
        |var test = 123
      """.trimMargin()

      it("should add variable with ${Modifier.VAR} modifier and assigned value") {
        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value!!.get() shouldBe 123
            actualConst.modifier shouldBe Modifier.VAR
          }
        }
      }

      it("can declare without assignment") {
        code = """
          |var test: int
        """.trimMargin()

        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with null value") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value.shouldBeNull()
            actualConst.modifier shouldBe Modifier.VAR
          }
        }
      }

      it("can be reassigned") {
        code = """
          |var test = 123
          |test = 456
        """.trimMargin()

        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 456") {
            size shouldBe 1

            val actualValue = get("test")
              .shouldNotBeNull()

            actualValue.value.shouldNotBeNull().get() shouldBe 456
            actualValue.modifier shouldBe Modifier.VAR
          }
        }
      }

      it("cannot reassign with value of different type") {
        code = """
          |var test = 123
          |test = "throws error"
        """.trimMargin()

        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualValue = get("test")
              .shouldNotBeNull()

            actualValue.value
              .shouldNotBeNull()
              .shouldBeTypeOf<IntValue>()
              .get()
              .shouldBe(123)
          }
        }
      }
    }
  }

  describe("output assignment") {
    lateinit var code: String

    describe("output is assigned") {
      code = """
        |output test = 123
      """.trimMargin()

      it("should have output") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.output().apply {
          withClue("should have one output set to 'test' with value 123") {
            size shouldBe 1

            val actualOutput = get("test")
              .shouldNotBeNull()

            actualOutput shouldBe 123
          }
        }
      }
    }

    describe("output value is already initialized") {
      code = """
        |const test = 123
        |output test
      """.trimMargin()

      it("should have output") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.output().apply {
          withClue("should have one output set to the 'test' 'const' variable") {
            size shouldBe 1

            val actualOutput = get("test")
              .shouldNotBeNull()

            actualOutput shouldBe 123
          }
        }
      }
    }

    describe("output value is not initialized") {
      code = """
        |var test
        |output test
      """.trimMargin()

      it("should reject setting value") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.output().apply {
          withClue("should not have any output") {
            shouldBeEmpty()
          }
        }
      }
    }
  }

  describe("import resource") {
    val resourceName = "TestResource"
    val resourcePath = "org.merideum"
    var code: String = """
          |import testResource: $resourceName
        """.trimMargin()

    lateinit var variableScope: VariableScope

    beforeEach {
      variableScope = VariableScope(null, mutableMapOf())
    }

    describe("when the resource is resolvable") {

      it("should resolve the resource and not throw an error") {
        every { resourceResolver.resolve(resourceName) } returns TestResource(resourceName, "", "123")

        shouldNotThrow<ResourceResolutionException> { executeCode(code, variableScope) }

        withClue("should add resource as a variable to the root scope") {
          variableScope.variables.run {
            shouldHaveSize(1)

            get("testResource")
              .shouldNotBeNull()
              .modifier shouldBe Modifier.CONST
          }
        }
      }
    }

    describe("when the resource is unresolvable") {

      it("should resolve the resource and not throw an error") {
        every { resourceResolver.resolve(resourceName) } returns null

        val actualException = shouldThrow<ResourceResolutionException> { executeCode(code, variableScope) }

        actualException.message shouldBe "Could not resolve resource: TestResource"

        withClue("should not add resource as a variable") {
          variableScope.variables.shouldBeEmpty()
        }
      }
    }

    describe("when a path is included in the resource name") {
      code = """
        |import test: $resourcePath.$resourceName
      """.trimMargin()

      it("should resolve the resource and not throw an error") {
        every { resourceResolver.resolve(resourceName, resourcePath) } returns TestResource(resourceName, resourcePath, "123")

        shouldNotThrow<ResourceResolutionException> { executeCode(code, variableScope) }

        withClue("should add resource as a variable to the root scope") {
          variableScope.variables.run {
            shouldHaveSize(1)

            get("test")
              .shouldNotBeNull()
              .modifier shouldBe Modifier.CONST
          }
        }
      }
    }

    describe("when a variable is declared with the same name as an imported resource") {
      code = """
        |import test: $resourceName
        |const test = 123
      """.trimMargin()

      it("should throw an exception") {
        every { resourceResolver.resolve(resourceName) } returns TestResource(resourceName, resourcePath, "123")

        val actualException = shouldThrow<IdentifierAlreadyDeclaredException> {
          executeCode(code, variableScope)
        }

        actualException.message shouldBe "The identifier 'test' has already been declared."
      }
    }
  }

  describe("built-in types") {
    var code: String

    var variableScope = VariableScope(null, mutableMapOf())

    beforeEach {
      variableScope = VariableScope(null, mutableMapOf())
    }

    describe("int") {
      it("can declare 'var' variable with type") {
        code = """
          |var test: int
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        actualVariable.type shouldBe Type.INT

        withClue("should have null 'value' since it is unassigned") {
          actualVariable.value.shouldBeNull()
        }
      }

      it("can declare and assign value") {
        code = """
          |var test: int
          |test = 4839218
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        actualVariable.type shouldBe Type.INT

        withClue("should be Kotlin 'Int' with expected value") {
          actualVariable.value
            .shouldNotBeNull()
            .shouldBeTypeOf<IntValue>()
            .get() shouldBe 123
        }
      }
    }

    describe("string") {
      it("can declare variable with type") {
        code = """
          |var test: string
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        actualVariable.type shouldBe Type.STRING

        withClue("should have null 'value' since it is unassigned") {
          actualVariable.value.shouldBeNull()
        }
      }

      it("can declare variable and assign value") {
        code = """
          |var test: string
          |test = "dksAKdj3029d@klnv*#*&#"
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        actualVariable.type shouldBe Type.STRING

        withClue("should be Kotlin 'String' with expected value") {
          actualVariable.value
            .shouldNotBeNull()
            .shouldBeTypeOf<StringValue>()
            .get() shouldBe "dksAKdj3029d@klnv*#*&#"
        }
      }

      it("value can be empty") {
        code = """
          |var test: string
          |test = ""
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        actualVariable.type shouldBe Type.STRING

        withClue("should be Kotlin 'String' with expected value") {
          actualVariable.value
            .shouldNotBeNull()
            .shouldBeTypeOf<StringValue>()
            .get().shouldBeEmpty()
        }
      }

      describe("interpolation") {
        it("can interpolate variable") {
          code = """
            |const name = "Merideum"
            |const greeting = "Hello ${'$'}{name}!"
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(2)

          val actualVariable = variableScope
            .resolveVariable("greeting")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.STRING

          withClue("should be Kotlin 'String' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<StringValue>()
              .get() shouldBe "Hello Merideum!"
          }
        }

        it("can interpolate function call") {
          code = """
            |const name = "Merideum"
            |const length = "The length of ${'$'}{name} is ${'$'}{name.length()}."
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(2)

          val actualVariable = variableScope
            .resolveVariable("length")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.STRING

          withClue("should be Kotlin 'String' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<StringValue>()
              .get() shouldBe "The length of Merideum is 8."
          }
        }
      }
    }
  }

  describe("function call") {
    var code = """
      |const largest = 555
      |const middle = 444
      |const smallest = 300
      |
      |const minimum = largest.min(middle.min(smallest))
      |
      |output minimum
    """.trimMargin()

    it("should call function") {
      val variableScope = VariableScope(null, mutableMapOf())

      val actualOutput = executeCode(code, variableScope)

      actualOutput.output()["minimum"] shouldBe 300
    }

    describe("function not in expression") {
      code = """
        |const stepCounter = 1
        |
        |stepCounter.min(300)
        |
      """.trimMargin()

      it("should call function") {
        val variableScope = VariableScope(null, mutableMapOf())

        shouldNotThrowAny {
          executeCode(code, variableScope)
        }
      }
    }
  }
})
