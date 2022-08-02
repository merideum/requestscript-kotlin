package org.merideum.kotlin.merit.interpreter.type.value

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.error.FunctionNotFoundException
import org.merideum.kotlin.merit.interpreter.type.ObjectType

class ObjectValue(
  override val value: MutableMap<String, Any?>?
): TypedValue<MutableMap<String, Any?>?> {

  // TODO revisit type name
  override val type = ObjectType()

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

  fun getField(name: String): Any? {
    // TODO throw better exception.
    if (value == null) throw RuntimeException("Cannot retrieve field of 'null' 'object'.")

    return value[name]
  }

  fun setField(name: String, fieldValue: TypedValue<*>) {
    // TODO check types
    // TODO throw better exception.
    if (value == null) throw RuntimeException("Cannot set field of 'null' 'object'.")

    value[name] = fieldValue.get()
  }

//  fun fieldToTypedValue(value: Any?): TypedValue<*>? {
//    when
//  }
}
