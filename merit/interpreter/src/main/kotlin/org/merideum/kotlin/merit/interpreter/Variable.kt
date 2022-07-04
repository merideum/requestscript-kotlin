package org.merideum.kotlin.merit.interpreter

import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypedValue

data class Variable<T>(
  val name: String,
  var value: TypedValue<T>?,
  val modifier: Modifier,
  val type: Type
) {
  val initialized = value != null
}
