package org.merideum.core.api.error

import org.merideum.core.interpreter.error.ScriptRuntimeException
import org.merideum.core.interpreter.error.ScriptSyntaxException

data class ErrorsContainer(
    val runtime: ScriptRuntimeException?,
    val syntax: ScriptSyntaxException?
) {
    fun toMap() = buildMap<String, Any> {
        if (runtime != null) {
            this["runtime"] = buildMap<String, Any> {
                this["type"] = runtime.type.name
                this["message"] = runtime.message
            }
        }

        if (syntax != null) {
            this["syntax"] = buildMap<String, Any> {
                this["type"] = syntax.type.name
                this["message"] = syntax.message
            }
        }
    }
}
