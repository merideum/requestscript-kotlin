package org.merideum.core.api.executor

import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.error.FunctionNotFoundException
import org.merideum.core.interpreter.type.TypedValue
import org.merideum.core.api.executor.error.RequestFailException

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
