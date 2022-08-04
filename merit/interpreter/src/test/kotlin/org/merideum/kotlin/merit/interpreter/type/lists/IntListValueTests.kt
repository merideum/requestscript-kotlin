package org.merideum.kotlin.merit.interpreter.type.lists

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.list.IntListValue

class IntListValueTests: DescribeSpec({
  val intListValue = IntListValue(listOf(12, 55))

  describe("built-in functions") {
    describe("at(index: int)") {
      it("should return the element at the index") {
        val functionResult = intListValue.callFunction(ScriptContext(), "at", listOf(IntValue(0)))

        functionResult
          .shouldNotBeNull()
          .shouldBeTypeOf<IntValue>()
          .get() shouldBe 12
      }
    }
  }

  describe("stringify()") {
    it("should return readable string") {
      val expected = "[12, 55]"

      val actual = intListValue.stringify()

      actual shouldBe expected
    }
  }
})
