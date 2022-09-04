package org.merideum.core.interpreter.script

enum class ScriptType {
  /**
   * A one-off request that does not contain parameters.
   */
  REQUEST,

  /**
   * A request that is saved to the server and called later with parameter values.
   */
  CONTRACT;

  companion object {
    fun fromString(value: String) = values().single { it.name.lowercase() == value }
  }
}
