package org.merideum.meriad.execution

/**
 * Contains the output from the Meriad code.
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
