package org.merideum.kotlin.merit.interpreter

/**
 * If the value is [Unit], then the [MeritValue] is nothing.
 * This is also used when a variable with [Modifier] 'VAR' has been declared but not initialized.
 */
data class MeritValue<T>(
  val value: T?
) {

  companion object {
    /**
     * Used to build a [MeritValue] that has no value.
     */
    fun nothing() = MeritValue(Unit)
  }
}
