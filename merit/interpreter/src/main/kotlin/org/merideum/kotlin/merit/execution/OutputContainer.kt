package org.merideum.kotlin.merit.execution

/**
 * Stores the output from the Merit code.
 */
class OutputContainer(
  private val output: MutableMap<String, Any?>
) {
  fun add(key: String, value: Any?) {
    output[key] = value
  }

  fun output() = output.toMap()

  companion object {
    fun empty() = OutputContainer(mutableMapOf())
  }
}
