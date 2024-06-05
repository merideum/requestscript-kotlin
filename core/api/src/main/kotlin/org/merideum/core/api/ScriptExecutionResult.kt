package org.merideum.core.api

/**
 * The result of a Merideum script run.
 */
data class ScriptExecutionResult(
    val returnValue: Any?,
) {
    fun toResponse() = buildMap {
        this["return"] = returnValue
    }
}
