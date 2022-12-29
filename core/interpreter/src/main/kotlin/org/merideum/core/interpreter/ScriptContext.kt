package org.merideum.core.interpreter

import org.merideum.core.interpreter.error.ScriptErrorType
import org.merideum.core.interpreter.error.ScriptRuntimeException
import java.lang.RuntimeException

data class ScriptContext(
    val context: Map<String, Any?> = emptyMap(),
    val parameters: Map<String, Any?> = emptyMap()
) {
    // The name of the script as set in the script definition.
    // This is a var here, because we do not have the name until interpretation starts.
    var scriptName: String? = null
        set(value) {
            if (field == null) {
                field = value
            } else {
                throw ScriptRuntimeException(
                    "Could not set scriptName that is already set.",
                    ScriptErrorType.SCRIPT_CONTEXT
                )
            }
        }

    inline fun <reified T> getOrThrow(key: String): T {
        val attribute = context[key]

        // TODO throw better exception
        return if (attribute != null && attribute is T) {
            attribute
        } else throw ScriptRuntimeException(
            "Could not get attribute '$key' from script context",
            ScriptErrorType.SCRIPT_CONTEXT
        )
    }
}
