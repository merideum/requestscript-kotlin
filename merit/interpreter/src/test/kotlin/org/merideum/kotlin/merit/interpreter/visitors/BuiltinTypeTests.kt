package org.merideum.kotlin.merit.interpreter.visitors

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldHaveSize
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty
import io.kotest.matchers.types.shouldBeTypeOf
import org.merideum.kotlin.merit.interpreter.VariableScope
import org.merideum.kotlin.merit.interpreter.error.TypeMismatchedException
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.list.IntListValue
import org.merideum.kotlin.merit.interpreter.utils.executeCode

/**
 * Tests for built-in types, built-in type functions, and affected behaviors (assignments, expressions, etc.)
 */
class BuiltinTypeTests: DescribeSpec({
  describe("built-in types") {
    var code: String

    var variableScope = VariableScope(null, mutableMapOf())

    beforeEach {
      variableScope = VariableScope(null, mutableMapOf())
    }

    describe("int") {
      it("can declare 'var' variable with type") {
        code = """
          |request myRequest {
          |  var test: int
          |}
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
          |request myRequest {
          |  var test: int
          |  test = 4839218
          |}
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
            .get() shouldBe 4839218
        }
      }

      it("can declare and assign negative value") {
        code = """
          |request myRequest {
          |  var test: int
          |  test = -4839218
          |}
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
            .get() shouldBe -4839218
        }
      }
    }

    describe("string") {
      it("can declare variable with type") {
        code = """
          |request myRequest {
          |  var test: string
          |}
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
          |request myRequest {
          |  var test: string
          |  test = "dksAKdj3029d@klnv*#*&#"
          |}
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
          |request myRequest {
          |  var test: string
          |  test = ""
          |}
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
            |request myRequest {
            |  const name = "Merideum"
            |  const greeting = "Hello ${'$'}{name}!"
            |}
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
            |request myRequest {
            |  const name = "Merideum"
            |  const length = "The length of ${'$'}{name} is ${'$'}{name.length()}."
            |}
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

        it("can interpolate integer") {
          code = """
            |request myRequest {
            |  const age = "The age of this string is ${'$'}{1733}."
            |}
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(1)

          val actualVariable = variableScope
            .resolveVariable("age")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.STRING

          withClue("should be Kotlin 'String' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<StringValue>()
              .get() shouldBe "The age of this string is 1733."
          }
        }

        it("can interpolate string") {
          code = """
            |request myRequest {
            |  const message = "Hello ${'$'}{"World"}!"
            |}
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(1)

          val actualVariable = variableScope
            .resolveVariable("message")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.STRING

          withClue("should be Kotlin 'String' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<StringValue>()
              .get() shouldBe "Hello World!"
          }
        }

        it("can interpolate nested string interpolation") {
          code = """
            |request myRequest {
            |  const message = "Hello ${'$'}{"Wo${'$'}{"rld"}"}!"
            |}
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(1)

          val actualVariable = variableScope
            .resolveVariable("message")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.STRING

          withClue("should be Kotlin 'String' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<StringValue>()
              .get() shouldBe "Hello World!"
          }
        }
      }
    }

    describe("object") {
      it("can declare 'var' variable with type") {
        code = """
          |request myRequest {
          |  var test: object
          |}
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        actualVariable.type shouldBe Type.OBJECT

        withClue("should have null 'value' since it is unassigned") {
          actualVariable.value.shouldBeNull()
        }
      }

      it("can declare and assign value") {
        code = """
          |request myRequest {
          |  var test: object
          |  test = {
          |    foo = "bar"
          |  }
          |}
        """.trimMargin()

        val expectedMap = mutableMapOf("foo" to "bar")

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        withClue("should be Kotlin 'Map' with expected value") {
          actualVariable.value
            .shouldNotBeNull()
            .shouldBeTypeOf<ObjectValue>()
            .get() shouldBe expectedMap
        }
      }

      it("can declare and assign multiple fields") {
        code = """
          |request myRequest {
          |  var test: object
          |  test = {
          |    foo: string = "bar",
          |    fooInt = 1234,
          |    fooObject = {
          |      nestedFoo = "Nested!"
          |    }
          |  }
          |}
        """.trimMargin()

        val expectedMap =
          mutableMapOf("foo" to "bar", "fooInt" to 1234, "fooObject" to mutableMapOf("nestedFoo" to "Nested!"))

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(1)

        val actualVariable = variableScope
          .resolveVariable("test")
          .shouldNotBeNull()

        withClue("should be Kotlin 'Map' with expected value") {
          actualVariable.value
            .shouldNotBeNull()
            .shouldBeTypeOf<ObjectValue>()
            .get() shouldBe expectedMap
        }
      }

      it("cannot declare field with different type than value") {
        code = """
          |request myRequest {
          |  const test = {
          |    foo: string = 1234,
          |  }
          |}
        """.trimMargin()

        val exception = shouldThrow<TypeMismatchedException> {
          executeCode(code, variableScope)
        }

        exception.type shouldBe Type.STRING
        exception.otherType shouldBe Type.INT

        exception.message shouldBe "Cannot perform operation between types 'string' and 'int'"
      }

      it("should return value of referenced field") {
        code = """
          |request myRequest {
          |  const person = {
          |    name = "Merideum"
          |  }
          |  
          |  const name = person.name
          |}
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(2)

        val actualVariable = variableScope
          .resolveVariable("name")
          .shouldNotBeNull()

        withClue("should be Kotlin 'String' with expected value") {
          actualVariable.value
            .shouldNotBeNull()
            .shouldBeTypeOf<StringValue>()
            .get() shouldBe "Merideum"
        }
      }

      it("should return value of field referenced by indexing") {
        code = """
          |request myRequest {
          |  const person = {
          |    name = "Merideum"
          |  }
          |  
          |  const name = person["name"]
          |}
        """.trimMargin()

        executeCode(code, variableScope)

        variableScope.variables.shouldHaveSize(2)

        val actualVariable = variableScope
          .resolveVariable("name")
          .shouldNotBeNull()

        withClue("should be Kotlin 'String' with expected value") {
          actualVariable.value
            .shouldNotBeNull()
            .shouldBeTypeOf<StringValue>()
            .get() shouldBe "Merideum"
        }
      }
    }

    describe("list") {

      describe("[int]") {
        it("can declare 'var' variable with type") {
          code = """
          |request myRequest {
          |  var test: [int]
          |}
        """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(1)

          val actualVariable = variableScope
            .resolveVariable("test")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.LIST_INT

          withClue("should have null 'value' since it is unassigned") {
            actualVariable.value.shouldBeNull()
          }
        }

        it("can declare and assign value") {
          code = """
          |request myRequest {
          |  var test: [int]
          |  test = [123]
          |}
        """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(1)

          val actualVariable = variableScope
            .resolveVariable("test")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.LIST_INT

          withClue("should be Kotlin 'List<Int>' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<IntListValue>()
              .get() shouldBe listOf(123)
          }
        }

        it("stores many values") {
          code = """
            |request myRequest {
            |  var test: [int]
            |  test = [
            |    123,
            |    456,
            |    789
            |  ]
            |}
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(1)

          val actualVariable = variableScope
            .resolveVariable("test")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.LIST_INT

          withClue("should be Kotlin 'List<Int>' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<IntListValue>()
              .get() shouldBe listOf(123, 456, 789)
          }
        }

        it("should allow expression as value") {
          code = """
            |request myRequest {
            |  var test: [int]
            |  
            |  const second = 456
            |  
            |  test = [
            |    123,
            |    second,
            |    789
            |  ]
            |}
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(2)

          val actualVariable = variableScope
            .resolveVariable("test")
            .shouldNotBeNull()

          actualVariable.type shouldBe Type.LIST_INT

          withClue("should be Kotlin 'List<Int>' with expected value") {
            actualVariable.value
              .shouldNotBeNull()
              .shouldBeTypeOf<IntListValue>()
              .get() shouldBe listOf(123, 456, 789)
          }
        }

        it("should get element at index") {
          code = """
            |request myRequest {
            |  const test = [123, 456]
            |  
            |  const first = test[0]
            |}
          """.trimMargin()

          executeCode(code, variableScope)

          variableScope.variables.shouldHaveSize(2)

          val actualVariable = variableScope
            .resolveVariable("first")
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
    }

    describe("type checking") {
      describe("declaring a variable with a value with a different type declaration") {
        it("should throw exception") {
          code = """
            |request myRequest {
            |  const test: string = 123
            |}
          """.trimMargin()

          val exception = shouldThrow<TypeMismatchedException> {
            executeCode(code, variableScope)
          }

          exception.type shouldBe Type.STRING
          exception.otherType shouldBe Type.INT

          exception.message shouldBe "Cannot perform operation between types 'string' and 'int'"
        }
      }

      describe("assigning a variable to a value of different type") {
        it("should throw exception") {
          code = """
            |request myRequest {
            |  var test: string
            |  test = 123
            |}
          """.trimMargin()

          val exception = shouldThrow<TypeMismatchedException> {
            executeCode(code, variableScope)
          }

          exception.type shouldBe Type.STRING
          exception.otherType shouldBe Type.INT

          exception.message shouldBe "Cannot perform operation between types 'string' and 'int'"
        }
      }

      describe("assigning a variable the result of a function") {
        it("should throw exception") {
          code = """
            |request myRequest {
            |  var test: string
            |  test = 123
            |
            |  var length: string
            |  length = test.length()
            |}
          """.trimMargin()

          val exception = shouldThrow<TypeMismatchedException> {
            executeCode(code, variableScope)
          }

          exception.type shouldBe Type.STRING
          exception.otherType shouldBe Type.INT

          exception.message shouldBe "Cannot perform operation between types 'string' and 'int'"
        }
      }
    }
  }
})
