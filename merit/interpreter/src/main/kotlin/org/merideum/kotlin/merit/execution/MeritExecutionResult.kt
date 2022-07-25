package org.merideum.kotlin.merit.execution

/**
 * The result of a Merit script run.
 */
data class MeritExecutionResult(
  val output: Map<String, Any?>?
)
