package org.merideum.core.interpreter.type

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import org.antlr.v4.runtime.RuleContext
import org.merideum.core.interpreter.FunctionCallContext
import org.merideum.core.interpreter.ScriptContext

class StringValueTests : DescribeSpec({
    var stringValue: StringValue
    describe("built-in functions") {
        describe("length()") {
            it("should get length of string") {
                stringValue = StringValue("Merideum")

                val functionResult = stringValue.callFunction(
                    FunctionCallContext(
                        "length",
                        emptyList(),
                        ScriptContext(),
                        RuleContext.EMPTY
                    )
                )

                functionResult
                    .shouldNotBeNull()
                    .shouldBeTypeOf<IntValue>()
                    .get() shouldBe 8
            }
        }
    }

    describe("stringify()") {
        it("should return readable string") {
            stringValue = StringValue("Merideum")
            val expected = "Merideum"

            val actual = stringValue.stringify()

            actual shouldBe expected
        }
    }
})
