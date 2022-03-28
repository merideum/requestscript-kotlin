package org.merideum.meriad.execution

/**
 * The result of a Meriad script run.
 */
data class MeriadExecutionResult(
  val output: Map<String, Any?>
)
