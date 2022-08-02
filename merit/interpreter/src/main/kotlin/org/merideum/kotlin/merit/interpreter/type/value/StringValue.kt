package org.merideum.kotlin.merit.interpreter.type.value

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException
import org.merideum.kotlin.merit.interpreter.type.StringType
import org.merideum.kotlin.merit.interpreter.type.Type

class StringValue(override val value: String?) : TypedValue<String> {

  override val type = StringType()

  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any {
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
