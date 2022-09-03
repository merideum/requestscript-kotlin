package org.merideum.server.interpreter.type.list

import org.merideum.server.interpreter.type.StringValue
import org.merideum.server.interpreter.type.Type
import org.merideum.server.interpreter.type.TypedValue

data class StringListValue(override val value: List<StringValue>) : ListValue<StringValue, String> {
  override fun getValue(index: Int): TypedValue<*> {
    return value[index]
  }

  override val type = Type.LIST_STRING
}
