package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException

class StringValue(override val value: String?) : TypedValue<String> {

  override val type = Type.STRING

  override fun callFunction(functionName: String, parameters: List<*>): Any? {
    if (value == null) throw FunctionNotFoundException(functionName)

    if (functionName == "length" && parameters.isEmpty()) {

      /**
       * We need to rewrap the value as an [IntValue].
       */
      return IntValue(value.length)
    }

    throw FunctionNotFoundException(functionName)
  }

  override fun get(): String? {
    return value
  }

  override fun stringify(): String {
    return value.toString()
  }
}
