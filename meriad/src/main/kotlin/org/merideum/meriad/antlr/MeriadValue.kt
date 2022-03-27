package org.merideum.meriad.antlr

data class MeriadValue(
  var value: Any,
  val mutability: Mutability
) {
  companion object {
    fun nothing() = MeriadValue(Unit, Mutability.IMMUTABLE)
  }
}
