package org.merideum.kotlin.merit.interpreter.visitors

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.maps.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.kotlin.merit.interpreter.error.VariableAlreadyDeclaredException
import org.merideum.merit.antlr.MeritLexer
import org.merideum.merit.antlr.MeritParser

class MeritVisitorTests: DescribeSpec({
  lateinit var resourceResolver: ResourceResolver

  class TestResource(override val name: String, override val path: String) : Resource

  beforeAny {
    resourceResolver = mockk()
  }

  fun executeCode(
    code: String,
    variableScope: VariableScope = VariableScope(null, mutableMapOf()),
    outputContainer: OutputContainer = OutputContainer.empty()
  ) {
    val lexer = MeritLexer(CharStreams.fromString(code))
    val parser = MeritParser(CommonTokenStream(lexer))

    parser.buildParseTree = true

    val parseTree = parser.parse()

    val visitor = MeritVisitor(variableScope, outputContainer, resourceResolver)

    visitor.visit(parseTree)
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

            actualConst.value shouldBe 123
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

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value 123") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe 123
            actualConst.modifier shouldBe Modifier.CONST
          }
        }
      }

      it("should reject declaration without assignment") {
        code = """
          |const test
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

            actualConst.value shouldBe 123
            actualConst.modifier shouldBe Modifier.VAR
          }
        }
      }

      it("can declare without assignment") {
        code = """
          |var test
        """.trimMargin()

        val variableScope = VariableScope(null, mutableMapOf())

        executeCode(code, variableScope)

        variableScope.variables.apply {
          withClue("should have one variable named 'test' with value Unit") {
            size shouldBe 1

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe Unit
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

            val actualConst = get("test")
              .shouldNotBeNull()

            actualConst.value shouldBe 456
            actualConst.modifier shouldBe Modifier.VAR
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
        every { resourceResolver.resolve(resourceName) } returns TestResource(resourceName, "")

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

      it("should resolve the dependency and not throw an error") {
        every { resourceResolver.resolve(resourceName, resourcePath) } returns TestResource(resourceName, resourcePath)

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
        every { resourceResolver.resolve(resourceName) } returns TestResource(resourceName, resourcePath)

        val actualException = shouldThrow<VariableAlreadyDeclaredException> {
          executeCode(code, variableScope)
        }

        actualException.message shouldBe "The identifier 'test' has already been declared."
      }
    }
  }
})
