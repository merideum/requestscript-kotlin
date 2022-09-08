@file:Suppress("LargeClass")

package org.merideum.core.interpreter.visitors

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.maps.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.utils.executeCode

/**
 * Tests for the different expressions
 */
class ExpressionVisitorTests : DescribeSpec({
    describe("built-in types") {
        var code: String

        var variableScope = VariableScope(null, mutableMapOf())

        beforeEach {
            variableScope = VariableScope(null, mutableMapOf())
        }

        describe("simple identifier") {
            it("can assign value of variable value") {
                code = """
                    |request myRequest {
                    |  const firstName = "Merideum"
                    |
                    |  const fullName = firstName
                    |
                    |}
                """.trimMargin()

                executeCode(code, variableScope)

                variableScope.variables.shouldHaveSize(2)

                val actualVariable = variableScope
                    .resolveVariable("fullName")
                    .shouldNotBeNull()

                actualVariable.type shouldBe Type.STRING

                withClue("should have the value of the 'firstName' variable") {
                    actualVariable.value!!.get() shouldBe "Merideum"
                }
            }
        }
    }
})
