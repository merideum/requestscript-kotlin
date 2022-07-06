package org.merideum.kotlin.merit.interpreter.type

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf

class StringValueTests: DescribeSpec({
  var stringValue: StringValue
  describe("built-in functions") {
    describe("length()") {
      it("should get length of string") {
        stringValue = StringValue("Merideum")

        val functionResult = stringValue.callFunction("length", emptyList<Any?>())

        functionResult
          .shouldNotBeNull()
          .shouldBeTypeOf<IntValue>()
          .get() shouldBe 8
      }
    }
  }
})
