package org.merideum.ktor.server

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

/**
 * Kotlin Serialization does not support serialization of Any.
 * If the user chooses Kotlin Serialization (which we recommend),
 * we have to manually build the JSON object from the output.
 */
class ResponseBodySerializer {

    /**
     * Transforms a Kotlin [Map] into a [JsonObject].
     */
    fun deserialize(body: Map<String, Any?>?) = if (body == null) null else jsonElement(body)

    /**
     * Recursively transforms a Kotlin type to a [JsonElement]
     */
    private fun jsonElement(value: Any?): JsonElement {
        if (value == null) return JsonNull

        return when (value) {
            is List<*> -> mapJsonArray(value)

            is Map<*, *> -> {
                mapJsonObject(value)
            }

            is String -> JsonPrimitive(value)

            is Number -> JsonPrimitive(value)

            is Boolean -> JsonPrimitive(value)

            else -> JsonNull
        }
    }

    private fun mapJsonArray(value: List<*>) = JsonArray(value.map { jsonElement(it) })

    private fun mapJsonObject(value: Map<*, *>): JsonObject {
        val mapped = mutableMapOf<String, JsonElement>()
        value.forEach { (key, value) ->
            mapped[key.toString()] = jsonElement(value)
        }

        return JsonObject(mapped)
    }
}
