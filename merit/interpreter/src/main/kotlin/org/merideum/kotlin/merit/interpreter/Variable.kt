package org.merideum.kotlin.merit.interpreter

data class Variable<T>(
  val name: String,
  var value: VariableValue<T>,
  val modifier: Modifier
) {
  val initialized = value.get() !is Unit
}
