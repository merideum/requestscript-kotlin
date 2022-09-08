package org.merideum.core.interpreter

import org.merideum.core.interpreter.error.ScriptErrorType
import org.merideum.core.interpreter.error.ScriptRuntimeException

data class ScriptContext(
    val context: Map<String, Any?> = emptyMap()
) {
    inline fun <reified T> getOrThrow(key: String): T {
        val attribute = context[key]

        return if (attribute != null && attribute is T) {
            attribute
        } else throw ScriptRuntimeException(
            "Could not get attribute '$key' from script context",
            ScriptErrorType.SCRIPT_CONTEXT,
            null,
            null
        )
    }
}
