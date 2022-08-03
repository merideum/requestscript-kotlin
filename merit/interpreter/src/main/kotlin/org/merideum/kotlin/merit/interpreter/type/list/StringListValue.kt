package org.merideum.kotlin.merit.interpreter.type.list

import org.merideum.kotlin.merit.interpreter.type.StringListType
import org.merideum.kotlin.merit.interpreter.type.Type

data class StringListValue(override val value: List<String>?) : ListValue<String> {
  override val fieldType = StringListType()
  override val type = Type.LIST_STRING
}
