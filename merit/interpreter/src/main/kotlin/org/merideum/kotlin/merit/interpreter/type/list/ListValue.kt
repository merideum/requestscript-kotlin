package org.merideum.kotlin.merit.interpreter.type.list

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException
import org.merideum.kotlin.merit.interpreter.type.TypedValue

interface ListValue <T>: TypedValue<List<T>> {

  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): TypedValue<*> {
    if (value == null) throw FunctionNotFoundException(functionName)

    throw FunctionNotFoundException(functionName)
  }

  override fun get(): List<Any?>? {
    return value
  }

  override fun stringify(): String {
    return value.toString()
  }
}
