package org.merideum.core.api.error

import org.merideum.core.interpreter.error.ScriptRuntimeException

data class ErrorsContainer(
    val runtime: ScriptRuntimeException?
) {
    fun toMap() = buildMap<String, Any> {
        if (runtime != null) {
            this["runtime"] = buildMap<String, Any> {
                this["type"] = runtime.type.name
                this["message"] = runtime.message
            }
        }
    }
}
