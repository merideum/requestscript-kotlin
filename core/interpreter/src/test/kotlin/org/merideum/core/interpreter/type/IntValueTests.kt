package org.merideum.core.interpreter.type

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import org.merideum.core.interpreter.ScriptContext

class IntValueTests: DescribeSpec({
  var intValue: IntValue

  describe("built-in functions") {
    describe("min(other: int)") {
      it("should return the min value between self and other") {
        intValue = IntValue(12)

        val functionResult = intValue.callFunction(ScriptContext(), "min", listOf(IntValue(10)))

        functionResult
          .shouldNotBeNull()
          .shouldBeTypeOf<IntValue>()
          .get() shouldBe 10
      }
    }
  }

  describe("stringify()") {
    it("should return readable string") {
      intValue = IntValue(12)
      val expected = "12"

      val actual = intValue.stringify()

      actual shouldBe expected
    }
  }
})
