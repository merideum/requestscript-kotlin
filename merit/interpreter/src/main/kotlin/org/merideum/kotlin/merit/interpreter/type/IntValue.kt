package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException

class IntValue(override val value: Int?) : TypedValue<Int> {

  override val type = Type.INT

  override fun callFunction(functionName: String, parameters: List<*>): Any? {
    if (value == null) throw FunctionNotFoundException(functionName)

    if (functionName == "min" && parameters.size == 1) {
      val other = (parameters.first() as IntValue).value ?: throw FunctionNotFoundException(functionName)

      /**
       * We need to rewrap the value as an [IntValue].
       */
      return IntValue(minOf(value, other))
    }

    throw FunctionNotFoundException(functionName)
  }

  override fun get(): Int? {
    return value
  }

  override fun stringify(): String {
    return value.toString()
  }
}
