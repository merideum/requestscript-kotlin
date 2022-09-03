package org.merideum.server.interpreter.type.lists

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.server.interpreter.type.IntValue
import org.merideum.server.interpreter.type.ObjectValue
import org.merideum.server.interpreter.type.StringValue
import org.merideum.server.interpreter.type.list.ObjectListValue

class ObjectListValueTests: DescribeSpec({
  val expectedObjectValue = ObjectValue(mutableMapOf("foo" to StringValue("bar"), "test" to IntValue(123)))
  val objectListValue = ObjectListValue(listOf(expectedObjectValue))

  describe("stringify()") {
    it("should return readable string") {
      val expected = "[{foo=bar,test=123}]"

      val actual = objectListValue.stringify()

      actual shouldBe expected
    }
  }
})
