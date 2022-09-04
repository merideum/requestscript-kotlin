package org.merideum.core.api.executor

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.api.executor.error.RequestFailException

class RequestTests: DescribeSpec({
  val variable = Request(mapOf())

  val context = ScriptContext()

  describe("callFunction") {

    it("should resolve and call function") {
      shouldThrow<RequestFailException> {
        variable.callFunction(context, "fail", emptyList())
      }
    }
  }
})
