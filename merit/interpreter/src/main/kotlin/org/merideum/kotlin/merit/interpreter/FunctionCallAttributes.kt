package org.merideum.kotlin.merit.interpreter

data class FunctionCallAttributes(
  val name: String,
  val parameters: List<MeritValue<*>>
)
