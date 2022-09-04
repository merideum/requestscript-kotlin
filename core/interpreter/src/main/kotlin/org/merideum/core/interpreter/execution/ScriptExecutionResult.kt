package org.merideum.core.interpreter.execution

/**
 * The result of a Merideum script run.
 */
data class ScriptExecutionResult(
  val output: Map<String, Any?>?
)
