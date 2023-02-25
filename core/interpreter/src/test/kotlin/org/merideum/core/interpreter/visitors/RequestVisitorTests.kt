package org.merideum.core.interpreter.visitors

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.merideum.core.interpreter.Modifier
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.error.VariableCannotBeAssignedException
import org.merideum.core.interpreter.type.BuiltInTypes
import org.merideum.core.interpreter.utils.executeCode

class RequestVisitorTests : DescribeSpec({
    describe("expression") {
        describe("built-in types") {
            describe("int") {
                val code = """
                    request myRequest {
                        const foo = 123
                    }
                """.trimIndent()

                val variableScope = VariableScope.main()

                executeCode(code, variableScope)

                it("should parse value") {
                    val variable = variableScope.resolveVariable("foo")

                    variable.shouldNotBeNull()

                    withClue("variable should be int") {
                        variable.value.type.name shouldBe BuiltInTypes.INT.keyword
                    }

                    withClue("Variable value should match") {
                        variable.value.value shouldBe 123
                    }
                }
            }

            describe("string") {
                var code = """
                    request myRequest {
                        const foo = "Hello World!"
                    }
                """.trimIndent()

                var variableScope = VariableScope.main()

                executeCode(code, variableScope)

                it("should parse value") {
                    val variable = variableScope.resolveVariable("foo")

                    variable.shouldNotBeNull()

                    withClue("variable should be string") {
                        variable.value.type.name shouldBe BuiltInTypes.STRING.keyword
                    }

                    withClue("Variable value should match") {
                        variable.value.value shouldBe "Hello World!"
                    }
                }

                describe("embedded") {
                    describe("variable") {
                        it("should parse string value of variable") {
                            code = """
                                request myRequest {
                                    const name = "Merideum"
                                    
                                    const message = "Hello ${'$'}{name}!"
                                }
                            """.trimIndent()

                            variableScope = VariableScope.main()

                            executeCode(code, variableScope)

                            val variable = variableScope.resolveVariable("message")

                            variable.shouldNotBeNull()

                            withClue("variable should be string") {
                                variable.value.type.name shouldBe BuiltInTypes.STRING.keyword
                            }

                            withClue("Variable value should match") {
                                variable.value.value shouldBe "Hello Merideum!"
                            }
                        }
                    }
                }
            }
        }

        describe("identifier") {
            val code = """
                request MyRequest {
                    var bar = 111
                    const foo = bar
                    
                    bar = 222
                }
            """.trimIndent()

            val variableScope = VariableScope.main()

            executeCode(code, variableScope)

            it("should assign variable to value of identifier") {
                val variable = variableScope.resolveVariable("foo")

                variable.shouldNotBeNull()

                variable.value.value shouldBe 111
            }
        }
    }

    describe("statement") {
        describe("variable") {
            describe("const") {
                var code = """
                    request MyRequest {
                        const foo = 111
                    }
                """.trimIndent()

                var variableScope = VariableScope.main()

                executeCode(code, variableScope)

                it("should declare variable") {
                    variableScope.resolveVariable("foo")
                        .shouldNotBeNull()
                        .also {
                            it.modifier shouldBe Modifier.CONST

                            it.value.value shouldBe 111
                        }
                }

                it("cannot reassign") {
                    code = """
                        request MyRequest {
                            const foo = 111
                            foo = 222
                        }
                    """.trimIndent()

                    variableScope = VariableScope.main()

                    shouldThrow<VariableCannotBeAssignedException> {
                        executeCode(code, variableScope)
                    }
                }
            }

            describe("var") {
                var code = """
                    request MyRequest {
                        var foo = 111
                    }
                """.trimIndent()

                var variableScope = VariableScope.main()

                executeCode(code, variableScope)

                it("should declare variable") {
                    variableScope.resolveVariable("foo")
                        .shouldNotBeNull()
                        .also {
                            it.modifier shouldBe Modifier.VAR

                            it.value.value shouldBe 111
                        }
                }

                it("can reassign") {
                    code = """
                        request MyRequest {
                            var foo = 111
                            foo = 222
                        }
                    """.trimIndent()

                    variableScope = VariableScope.main()

                    executeCode(code, variableScope)

                    variableScope.resolveVariable("foo")
                        .shouldNotBeNull()
                        .also {
                            it.value.value shouldBe 222
                        }
                }
            }

            describe("shadowing") {
                val code = """
                    request MyRequest {
                        const foo = 111
                        const foo = 222
                    }
                """.trimIndent()

                val variableScope = VariableScope.main()

                executeCode(code, variableScope)

                it("should allow shadow of variable") {
                    variableScope.resolveVariable("foo")
                        .shouldNotBeNull()
                        .value.value shouldBe 222
                }
            }
        }
    }
})
