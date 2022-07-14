package org.merideum.kotlin.merit.interpreter.visitors

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.maps.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import io.mockk.every
import io.mockk.mockk
import org.merideum.kotlin.merit.execution.OutputContainer
import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.ResourceResolver
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.error.IdentifierAlreadyDeclaredException
import org.merideum.kotlin.merit.interpreter.error.ResourceResolutionException
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.utils.TestResource
import org.merideum.kotlin.merit.interpreter.utils.executeCode

class ScriptVisitorTests: DescribeSpec({
  lateinit var resourceResolver: ResourceResolver

  beforeEach {
    resourceResolver = mockk()
  }

  describe("output assignment") {
    lateinit var code: String

    describe("output is assigned") {
      code = """
        |request myRequest {
        |  output test = 123
        |}
      """.trimMargin()

      it("should have output") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.get().apply {
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
        |request myRequest {
        |  const test = 123
        |  output test
        |}
      """.trimMargin()

      it("should have output") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.get().apply {
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
        |request myRequest {
        |  var test: string
        |  output test
        |}
      """.trimMargin()

      it("should reject setting value") {
        val outputContainer = OutputContainer.empty()

        executeCode(code, outputContainer = outputContainer)

        outputContainer.get().apply {
          withClue("should not have any output") {
            shouldBeEmpty()
          }
        }
      }
    }
  }

  describe("resource") {
    var code: String
    val resourceName = "TestResource"
    val resourcePath = "org.merideum"
    lateinit var variableScope: VariableScope

    beforeEach {
      variableScope = VariableScope(null, mutableMapOf())
    }

    describe("import resource") {
      code = """
        |request myRequest {
        |  import testResource: $resourceName
        |}
      """.trimMargin()

      describe("when the resource is resolvable") {

        it("should resolve the resource and not throw an error") {
          every { resourceResolver.resolve(resourceName) } returns TestResource(resourceName, "", "123")

          shouldNotThrow<ResourceResolutionException> { executeCode(code, variableScope, resourceResolver = resourceResolver) }

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

          val actualException = shouldThrow<ResourceResolutionException> { executeCode(code, variableScope, resourceResolver = resourceResolver) }

          actualException.message shouldBe "Could not resolve resource: TestResource"

          withClue("should not add resource as a variable") {
            variableScope.variables.shouldBeEmpty()
          }
        }
      }

      describe("when a path is included in the resource name") {
        code = """
          |request myRequest {
          |  import test: $resourcePath.$resourceName
          |}
        """.trimMargin()

        it("should resolve the resource and not throw an error") {
          every { resourceResolver.resolve(resourceName, resourcePath) } returns TestResource(resourceName, resourcePath, "123")

          shouldNotThrow<ResourceResolutionException> { executeCode(code, variableScope, resourceResolver = resourceResolver) }

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
          |request myRequest {
          |  import test: $resourceName
          |  const test = 123
          |}
        """.trimMargin()

        it("should throw an exception") {
          every { resourceResolver.resolve(resourceName) } returns TestResource(resourceName, resourcePath, "123")

          val actualException = shouldThrow<IdentifierAlreadyDeclaredException> {
            executeCode(code, variableScope, resourceResolver = resourceResolver)
          }

          actualException.message shouldBe "The identifier 'test' has already been declared."
        }
      }
    }

    describe("function call") {

      beforeEach {
        every { resourceResolver.resolve(resourceName) } returns TestResource(resourceName, resourcePath, "123")
      }

      it("should call function of variable") {
        code = """
          |request myRequest {
          |  import test: $resourceName
          |  const greeting = test.sayHello()
          |}
        """.trimMargin()

        executeCode(code, variableScope, resourceResolver = resourceResolver)

        variableScope.variables.shouldHaveSize(2)

        val actualVariable = variableScope
          .resolveVariable("greeting")
          .shouldNotBeNull()
          .value
          .shouldBeTypeOf<StringValue>()

        actualVariable.get() shouldBe "Hello!"
      }

      it("should call function of TypedValue") {
        code = """
          |request myRequest {
          |  const testLength = "test".length()
          |}
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("testLength")
          .shouldNotBeNull()
          .value
          .shouldBeTypeOf<IntValue>()

        actualVariable.get() shouldBe 4
      }

      describe("with parameters") {
        it("should call function with 'string' parameter value") {
          code = """
            |request myRequest {
            |  import test: $resourceName
            |  const greeting = test.sayHello("Merideum")
            |}
          """.trimMargin()

          executeCode(code, variableScope, resourceResolver = resourceResolver)

          variableScope.variables.shouldHaveSize(2)

          val actualVariable = variableScope
            .resolveVariable("greeting")
            .shouldNotBeNull()
            .value
            .shouldBeTypeOf<StringValue>()

          actualVariable.get() shouldBe "Hello Merideum!"
        }

        it("should call function with variable parameter value") {
          code = """
            |request myRequest {
            |  import test: $resourceName
            |  const name = "Merideum"
            |  const greeting = test.sayHello(name)
            |}
          """.trimMargin()

          executeCode(code, variableScope, resourceResolver = resourceResolver)

          variableScope.variables.shouldHaveSize(3)

          val actualVariable = variableScope
            .resolveVariable("greeting")
            .shouldNotBeNull()
            .value
            .shouldBeTypeOf<StringValue>()

          actualVariable.get() shouldBe "Hello Merideum!"
        }
      }

      describe("output assignment") {
        it("should return value to output") {
          code = """
            |request myRequest {
            |  import test: $resourceName
            |  output greeting = test.sayHello("Merideum")
            |}
          """.trimMargin()

          val output = executeCode(code, variableScope, resourceResolver = resourceResolver)

          output.get()["greeting"] shouldBe "Hello Merideum!"
        }
      }
    }
  }
})
