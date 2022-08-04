package org.merideum.kotlin.merit.interpreter.type.lists

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.list.StringListValue

class StringListValueTests: DescribeSpec({
  val stringListValue = StringListValue(listOf("asdf", "foobar"))

  describe("built-in functions") {
    describe("at(index: int)") {
      it("should return the element at the index") {
        val functionResult = stringListValue.callFunction(ScriptContext(), "at", listOf(IntValue(0)))

        functionResult
          .shouldNotBeNull()
          .shouldBeTypeOf<StringValue>()
          .get() shouldBe "asdf"
      }
    }
  }

  describe("stringify()") {
    it("should return readable string") {
      val expected = "[asdf, foobar]"

      val actual = stringListValue.stringify()

      actual shouldBe expected
    }
  }
})
