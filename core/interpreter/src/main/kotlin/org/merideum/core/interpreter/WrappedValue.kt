package org.merideum.core.interpreter

/**
 * If the value is [Unit], then the [WrappedValue] is nothing.
 * This is also used when a variable with [Modifier] 'VAR' has been declared but not initialized.
 */
data class WrappedValue<T>(
  val value: T?
) {

  companion object {
    /**
     * Used to build a [WrappedValue] that has no value.
     */
    fun nothing() = WrappedValue(Unit)
  }
}
