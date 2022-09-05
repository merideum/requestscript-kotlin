package org.merideum.core.interpreter.visitors

import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.merideum.core.interpreter.VariableScope
import org.merideum.core.interpreter.utils.executeCode

class FunctionCallVisitorTests: DescribeSpec({
  describe("function call") {
    var code = """
      |request myRequest {
      |  const largest = 555
      |  const middle = 444
      |  const smallest = 300
      |
      |  const minimum = largest.min(middle.min(smallest))
      |
      |  return minimum
      |}
    """.trimMargin()

    it("should call function") {
      val variableScope = VariableScope(null, mutableMapOf())

      val actualOutput = executeCode(code, variableScope)
        .shouldNotBeNull()

      actualOutput["minimum"] shouldBe 300
    }

    describe("function not in expression") {
      code = """
        |request myRequest {
        |  const stepCounter = 1
        |
        |  stepCounter.min(300)
        |}
      """.trimMargin()

      it("should call function") {
        val variableScope = VariableScope(null, mutableMapOf())

        shouldNotThrowAny {
          executeCode(code, variableScope)
        }
      }
    }
  }
})
