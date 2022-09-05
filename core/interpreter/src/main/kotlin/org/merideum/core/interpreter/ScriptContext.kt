package org.merideum.core.interpreter

data class ScriptContext(
    val context: Map<String, Any?> = emptyMap()
) {
    inline fun <reified T> getOrThrow(key: String): T {
        val attribute = context[key]

        // TODO throw better exception
        return if (attribute != null && attribute is T) {
            attribute
        } else throw RuntimeException("Could not get attribute '$key'")
    }
}
