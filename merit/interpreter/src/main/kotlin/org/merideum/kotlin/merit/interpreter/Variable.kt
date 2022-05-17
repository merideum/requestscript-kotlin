package org.merideum.kotlin.merit.interpreter

data class Variable(
  val name: String,
  var value: Any?,
  val modifier: Modifier
) {
  val initialized = value !is Unit
}
