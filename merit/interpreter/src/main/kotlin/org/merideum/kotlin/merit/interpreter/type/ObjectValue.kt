package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException

class ObjectValue(override val value: MutableMap<String, Any?>?) : TypedValue<MutableMap<String, Any?>> {

  override val type = Type.OBJECT

  override fun callFunction(functionName: String, parameters: List<*>): Any? {
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

  fun getField(name: String): Any? {
    // TODO throw better exception.
    if (value == null) throw RuntimeException("Cannot retrieve field of 'null' 'object'.")

    return value[name]
  }
}
