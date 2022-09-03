package org.merideum.ktor.server.executor

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.MeritObject
import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.buildObject
import org.merideum.ktor.server.executor.error.RequestFailException
import org.merideum.ktor.server.executor.serializer.ObjectSerializer
import org.merideum.ktor.server.plugin.FunctionParser

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
