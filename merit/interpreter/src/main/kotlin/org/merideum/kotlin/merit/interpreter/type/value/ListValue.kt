package org.merideum.kotlin.merit.interpreter.type.value

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException
import org.merideum.kotlin.merit.interpreter.type.ListType
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypeOption
import org.merideum.kotlin.merit.interpreter.type.kotlinTypeToMeritType

class ListValue(override val value: List<*>?, innerType: Type) : TypedValue<List<*>> {

  override val type = ListType(innerType)

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

  companion object {
    fun fromKotlinList(value: List<*>): ListValue {
      return ListValue(value, kotlinTypeToMeritType(value))
    }
  }
}
