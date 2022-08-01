package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException

class ListValue(override val value: List<*>?) : TypedValue<List<*>> {

  override val type = Type.LIST

  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any? {
    if (value == null) throw FunctionNotFoundException(functionName)

    throw FunctionNotFoundException(functionName)
  }

  override fun get(): List<*>? {
    return value
  }

  // TODO map the fields without TypedValue wrappers.
  override fun stringify(): String {
    return value.toString()
  }
}
