package org.merideum.meriad.antlr

/**
 * If the value is [Unit], then the [MeriadValue] is nothing.
 * This is also used when a variable with [Modifier] 'VAR' has been declared but not initialized.
 */
data class MeriadValue(
  var value: Any?
) {

  companion object {
    /**
     * Used to build a [MeriadValue] that has no value.
     */
    fun nothing() = MeriadValue(Unit)
  }
}
