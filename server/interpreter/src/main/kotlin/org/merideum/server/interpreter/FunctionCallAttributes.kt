package org.merideum.server.interpreter

data class FunctionCallAttributes(
  val name: String,
  val parameters: List<org.merideum.server.interpreter.MeritValue<*>>
)
