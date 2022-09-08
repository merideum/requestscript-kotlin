package org.merideum.core.api

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import org.antlr.v4.runtime.RuleContext
import org.merideum.core.api.error.RequestFailException
import org.merideum.core.interpreter.FunctionCallContext
import org.merideum.core.interpreter.ScriptContext

class RequestTests : DescribeSpec({
    val variable = Request(mapOf())

    val scriptContext = ScriptContext()

    describe("callFunction") {

        it("should resolve and call function") {
            val functionContext = FunctionCallContext("fail", emptyList(), scriptContext, RuleContext.EMPTY)

            shouldThrow<RequestFailException> {
                variable.callFunction(functionContext)
            }
        }
    }
})
