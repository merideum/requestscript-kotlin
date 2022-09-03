package org.merideum.server.interpreter.type.list

import org.merideum.server.interpreter.type.IntValue
import org.merideum.server.interpreter.type.Type
import org.merideum.server.interpreter.type.TypedValue

data class IntListValue(override val value: List<IntValue>?) : ListValue<IntValue, Int> {

  // TODO check value is not null and index is not out of bounds
  override fun getValue(index: Int): TypedValue<*> {
    return value!![index]
  }

  override val type = Type.LIST_INT
}
