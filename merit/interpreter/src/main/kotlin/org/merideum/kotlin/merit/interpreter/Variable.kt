package org.merideum.kotlin.merit.interpreter

import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.value.TypedValue

data class Variable(
  val name: String,
  var value: TypedValue<*>?,
  val modifier: Modifier,
  val type: Type
) {
  val initialized = value != null
}
