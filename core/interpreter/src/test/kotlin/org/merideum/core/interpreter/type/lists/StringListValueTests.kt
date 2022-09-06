package org.merideum.core.interpreter.type.lists

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.core.interpreter.type.StringValue
import org.merideum.core.interpreter.type.list.StringListValue

class StringListValueTests : DescribeSpec({
    val stringListValue = StringListValue(listOf(StringValue("asdf"), StringValue("foobar")))

    describe("stringify()") {
        it("should return readable string") {
            val expected = "[asdf, foobar]"

            val actual = stringListValue.stringify()

            actual shouldBe expected
        }
    }
})
