package org.merideum.meriad.antlr

data class Variable(
  val name: String,
  var value: Any?,
  val modifier: Modifier
) {
  val initialized = value !is Unit
}
