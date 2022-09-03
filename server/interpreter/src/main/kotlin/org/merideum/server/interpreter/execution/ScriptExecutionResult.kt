package org.merideum.server.execution

/**
 * The result of a Merit script run.
 */
data class ScriptExecutionResult(
  val output: Map<String, Any?>?
)
