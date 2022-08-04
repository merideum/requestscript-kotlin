package org.merideum.kotlin.merit.interpreter.type.list

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException
import org.merideum.kotlin.merit.interpreter.type.TypedValue

interface ListValue <T>: TypedValue<List<T>> {

  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): TypedValue<*> {
    if (value == null) throw FunctionNotFoundException(functionName)

    // TODO check for index out of bounds
    if (functionName == "at") {
      val indexParameter = parameters.single().get()
      if (indexParameter is Int) {
        return type.innerType()!!.newValue(value!![indexParameter])
      } else {
        throw RuntimeException("Cannot call function $functionName with parameters $parameters")
      }
    }

    throw FunctionNotFoundException(functionName)
  }

  override fun get(): List<Any?>? {
    return value
  }

  override fun stringify(): String {
    return "[${value?.joinToString { it.toString() } ?: ""}]"
  }
}
