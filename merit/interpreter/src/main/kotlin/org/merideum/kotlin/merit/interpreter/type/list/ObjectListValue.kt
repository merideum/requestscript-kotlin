package org.merideum.kotlin.merit.interpreter.type.list

import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypedValue

data class ObjectListValue(override val value: List<ObjectValue>?) : ListValue<ObjectValue, MutableMap<String, TypedValue<*>>> {
  // If the value is null, then there is no object structure, so its list should be empty
  override val type = Type.LIST_OBJECT

  override fun get(): List<MutableMap<String, Any?>?>? {
    return value?.map {
      it.get()
    }
  }

  override fun getValue(index: Int): TypedValue<*> {
    return value!![index]
  }
}
