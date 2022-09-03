package org.merideum.ktor.server.executor

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException
import org.merideum.ktor.server.executor.error.RequestFailException
import org.merideum.kotlin.merit.interpreter.type.TypedValue

/**
 * A variable that is injected into a script to represent the http request context.
 * The variable `request` in a request, and `contract` in a contract execution.
 */
data class Request(
  val headers: Map<String, String>
): Resource<Request> {
  override val name: String = ""
  override val path: String = ""
  override val value: Request
    get() = TODO("Not yet implemented")

  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any? {
    if (functionName == "fail") {
      throw RequestFailException()
    }

    throw FunctionNotFoundException(functionName)
  }

  override fun get(): Any? {
    TODO("Not yet implemented")
  }

  override fun getValue(): TypedValue<*> {
    TODO("Not yet implemented")
  }
}
