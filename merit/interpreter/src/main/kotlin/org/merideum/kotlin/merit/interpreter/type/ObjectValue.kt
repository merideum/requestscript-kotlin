package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException

class ObjectValue(override val value: MutableMap<String, Any?>?) : TypedValue<MutableMap<String, Any?>> {

  override val type = Type.OBJECT

  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any? {
    if (value == null) throw FunctionNotFoundException(functionName)

    throw FunctionNotFoundException(functionName)
  }

  override fun get(): MutableMap<String, Any?>? {
    return value
  }

  // TODO map the fields without TypedValue wrappers.
  override fun stringify(): String {
    return value.toString()
  }

  @Suppress("UNCHECKED_CAST")
  fun getField(name: String): Any? {
    // TODO throw better exception.
    if (value == null) throw RuntimeException("Cannot retrieve field of 'null' 'object'.")

    return value[name]
  }

  fun setField(name: String, fieldValue: Any?) {
    // TODO throw better exception.
    if (value == null) throw RuntimeException("Cannot set field of 'null' 'object'.")

    value[name] = fieldValue
  }
}
