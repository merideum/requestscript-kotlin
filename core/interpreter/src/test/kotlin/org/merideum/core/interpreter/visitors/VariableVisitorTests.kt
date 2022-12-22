package org.merideum.core.interpreter.visitors

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.merideum.core.interpreter.Modifier
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.error.IdentifierAlreadyDeclaredException
import org.merideum.core.interpreter.utils.executeCode

class VariableVisitorTests : DescribeSpec({
    var code: String

    describe("variable declaration") {
        describe("const") {
            code = """
                |request myRequest {
                |  const test = 123
                |}
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
                    |request myRequest {
                    |  const test = 123
                    |  test = 456
                    |}
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
                    |request myRequest {
                    |  const test
                    |}
                """.trimMargin()
                val variableScope = VariableScope(null, mutableMapOf())

                executeCode(code, variableScope)

                variableScope.variables.apply {
                    withClue("should not have any variables") {
                        shouldBeEmpty()
                    }
                }
            }

            it("should allow type declaration") {
                code = """
                    |request myRequest {
                    |  const test: string = "Foo"
                    |}
                """.trimMargin()
                val variableScope = VariableScope(null, mutableMapOf())

                executeCode(code, variableScope)

                variableScope.variables.apply {
                    withClue("should have variable 'test' with value 'Foo'") {
                        size shouldBe 1

                        val actualConst = get("test")
                            .shouldNotBeNull()

                        actualConst.value!!.get() shouldBe "Foo"
                        actualConst.modifier shouldBe Modifier.CONST
                    }
                }
            }
        }

        describe("var") {
            code = """
                |request myRequest {
                |  var test = 123
                |}
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
                |request myRequest {
                |  var test: int
                |}
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
                    |request myRequest {
                    |  var test = 123
                    |  test = 456
                    |}
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
        }
    }

    describe("object field assignment") {
        describe("field not already set") {
            it("adds new field") {
                code = """
                |request myRequest {
                |  const person = {
                |    firstName = "Foo"
                |  }
                |  
                |  person.lastName = "Bar"
                |}
                """.trimMargin()

                val variableScope = VariableScope(null, mutableMapOf())

                executeCode(code, variableScope)

                variableScope.variables.apply {
                    withClue("should have one variable named 'person' with expected fields") {
                        size shouldBe 1

                        val actualValue = get("person")
                            .shouldNotBeNull()

                        actualValue
                            .value
                            .shouldNotBeNull()
                            .get() shouldBe mapOf("firstName" to "Foo", "lastName" to "Bar")
                    }
                }
            }
        }

        describe("field already set") {
            it("can be reassigned") {
                code = """
                    |request myRequest {
                    |  const person = {
                    |    firstName = "Foo"
                    |  }
                    |  
                    |  person.firstName = "Bar"
                    |}
                """.trimMargin()

                val variableScope = VariableScope(null, mutableMapOf())

                executeCode(code, variableScope)

                variableScope.variables.apply {
                    withClue("should have one variable named 'person' with field 'firstName' value 'Bar'") {
                        size shouldBe 1

                        val actualValue = get("person")
                            .shouldNotBeNull()

                        actualValue
                            .value
                            .shouldNotBeNull()
                            .get() shouldBe mapOf("firstName" to "Bar")
                    }
                }
            }
        }
    }
})
