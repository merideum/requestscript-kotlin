package org.merideum.ktor.server.resources

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.examples.ktor.server.resources.Greeter

class GreeterTests : DescribeSpec({
    val greeter = Greeter()

    fun happyBirthdayMessage(value: String) = "Happy $value birthday!"

    describe("happyBirthday(age)") {
        it("should suffix 'st' when ends in 1 but does not end in 11") {
            greeter.happyBirthday(1) shouldBe happyBirthdayMessage("1st")
            greeter.happyBirthday(91) shouldBe happyBirthdayMessage("91st")
            greeter.happyBirthday(1001) shouldBe happyBirthdayMessage("1001st")

            greeter.happyBirthday(11) shouldBe happyBirthdayMessage("11th")
            greeter.happyBirthday(111) shouldBe happyBirthdayMessage("111th")

        }

        it("should suffix 'nd' when ends in 2 but does not end in 12") {
            greeter.happyBirthday(2) shouldBe happyBirthdayMessage("2nd")
            greeter.happyBirthday(72) shouldBe happyBirthdayMessage("72nd")
            greeter.happyBirthday(10002) shouldBe happyBirthdayMessage("10002nd")

            greeter.happyBirthday(12) shouldBe happyBirthdayMessage("12th")
            greeter.happyBirthday(1112) shouldBe happyBirthdayMessage("1112th")
        }

        it("should suffix 'rd' when ends in 3 but does not end in 13") {
            greeter.happyBirthday(3) shouldBe happyBirthdayMessage("3rd")
            greeter.happyBirthday(53) shouldBe happyBirthdayMessage("53rd")
            greeter.happyBirthday(138453) shouldBe happyBirthdayMessage("138453rd")

            greeter.happyBirthday(12) shouldBe happyBirthdayMessage("12th")
            greeter.happyBirthday(1112) shouldBe happyBirthdayMessage("1112th")
        }
    }
})
