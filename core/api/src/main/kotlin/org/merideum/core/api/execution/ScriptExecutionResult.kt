package org.merideum.core.api.execution

import org.merideum.core.api.error.ErrorsContainer

/**
 * The result of a Merideum script run.
 */
data class ScriptExecutionResult(
    val scriptName: String,
    val returnValue: Map<String, Any?>?,
    val errors: ErrorsContainer? = null
) {
    fun toResponse() = buildMap {
        if (errors == null) {
            this["return"] = returnValue
        } else {
            this["errors"] = errors.toMap()
        }
    }
}
