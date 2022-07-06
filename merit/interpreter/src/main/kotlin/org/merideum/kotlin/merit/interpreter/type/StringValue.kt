package org.merideum.kotlin.merit.interpreter.type

class StringValue(override val value: String?) : TypedValue<String> {

  override val type = Type.STRING

  override fun callFunction(functionName: String, parameters: List<*>): Any? {
    throw RuntimeException("There are no functions for Type 'string'")
  }

  override fun get(): String? {
    return value
  }

  override fun stringify(): String {
    return value.toString()
  }
}
