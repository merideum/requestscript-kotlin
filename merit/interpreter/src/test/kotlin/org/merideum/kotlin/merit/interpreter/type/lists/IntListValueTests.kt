package org.merideum.kotlin.merit.interpreter.type.lists

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.list.IntListValue

class IntListValueTests: DescribeSpec({
  val intListValue = IntListValue(listOf(IntValue(12), IntValue(55)))

  describe("stringify()") {
    it("should return readable string") {
      val expected = "[12, 55]"

      val actual = intListValue.stringify()

      actual shouldBe expected
    }
  }
})
