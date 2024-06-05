package org.requestscript.core.api

/**
 * The result of a RequestScript run.
 */
data class ScriptExecutionResult(
    val returnValue: Any?,
) {
    fun toResponse() = buildMap {
        this["return"] = returnValue
    }
}
