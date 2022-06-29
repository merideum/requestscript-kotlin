package org.merideum.ktor.server.executor

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class InternalResourceTests: DescribeSpec({
  class HelloWorldService {
    fun sayHello() = "Hello World!"
    fun sayHello(name: String) = "Hello $name!"
    fun guessAge(name: String, age: Int) = "Hello $name! Are you $age years old?"
  }

  describe("callFunction") {
    val variable = InternalResource(
      "test",
      "org.merideum",
      HelloWorldService()
    )

    it("should resolve and call function") {
      variable.callFunction("sayHello", emptyList<Any>()) shouldBe "Hello World!"
    }

    describe("callFunction() with a parameter") {
      it("should resolve and use parameter passed in") {
        variable.callFunction("sayHello", listOf("Merideum")) shouldBe "Hello Merideum!"
      }
    }

    describe("callFunction() with many parameters") {
      it("should resolve and use parameters passed in") {
        variable.callFunction("guessAge", listOf("Merideum", 0)) shouldBe "Hello Merideum! Are you 0 years old?"
      }
    }
  }
})
