package org.merideum.core.api.execution

import org.merideum.core.api.error.ErrorsContainer

/**
 * The result of a Merideum script run.
 */
data class ScriptExecutionResult(
  val output: Map<String, Any?>?,
  val errors: ErrorsContainer? = null
) {
  fun toResponse() = buildMap {
    this["output"] = output

    if (errors != null) {
      this["errors"] = errors.toMap()
    }
  }
}
