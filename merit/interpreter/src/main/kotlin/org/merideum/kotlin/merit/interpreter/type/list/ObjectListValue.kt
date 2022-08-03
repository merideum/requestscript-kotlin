package org.merideum.kotlin.merit.interpreter.type.list

import org.merideum.kotlin.merit.interpreter.type.ObjectListType
import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.Type

data class ObjectListValue(override val value: List<ObjectValue>?) : ListValue<ObjectValue> {
  // If the value is null, then there is no object structure, so its list should be empty
  override val fieldType = ObjectListType(value?.map { it.fieldType } ?: emptyList())
  override val type = Type.LIST_OBJECT
}
