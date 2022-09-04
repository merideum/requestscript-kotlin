package org.merideum.core.interpreter

data class FunctionCallAttributes(
  val name: String,
  val parameters: List<WrappedValue<*>>
)
