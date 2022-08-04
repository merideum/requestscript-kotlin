package org.merideum.kotlin.merit.interpreter.type.list

import org.merideum.kotlin.merit.interpreter.type.Type

data class IntListValue(override val value: List<Int>?) : ListValue<Int> {
  override val type = Type.LIST_INT
}
