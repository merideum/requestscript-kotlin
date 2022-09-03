package org.merideum.server.interpreter

import org.merideum.server.interpreter.type.Type
import org.merideum.server.interpreter.type.TypedValue

data class Variable<T>(
  val name: String,
  var value: TypedValue<T>?,
  val modifier: Modifier,
  val type: Type
) {
  val initialized = value != null
}
