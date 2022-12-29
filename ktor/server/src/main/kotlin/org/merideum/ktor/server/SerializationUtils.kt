package org.merideum.ktor.server

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.double
import kotlinx.serialization.json.int
import kotlinx.serialization.json.intOrNull
import kotlinx.serialization.json.long
import kotlinx.serialization.json.longOrNull

fun jsonToMap(jsonObject: JsonObject): Map<String, Any?> {
    val newMap = mutableMapOf<String, Any?>()

    jsonObject.forEach { (key, value) ->
        newMap[key] = anyFromElement(value)
    }

    return newMap
}

private fun anyFromElement(value: JsonElement): Any? {
    return when (value) {
        is JsonArray -> value.map(::anyFromElement)

        is JsonObject -> {
            jsonToMap(value)
        }

        is JsonPrimitive -> primitiveFromElement(value)

        else -> JsonNull
    }
}

private fun primitiveFromElement(value: JsonPrimitive): Any? {
    return when {
        value is JsonNull -> {
            null
        }

        value.intOrNull != null -> {
            value.int
        }

        value.isString -> {
            value.content
        }

        value.booleanOrNull != null -> {
            value.boolean
        }

        value.longOrNull != null -> {
            value.long
        }

        else -> {
            value.double
        }
    }
}

/**
 * Kotlin Serialization does not support serialization of Any.
 * If the user chooses Kotlin Serialization (which we recommend),
 * we have to manually build the JSON object from the output.
 */

/**
 * Transforms a Kotlin [Map] into a [JsonObject].
 */
fun mapToJson(body: Map<String, Any?>) = jsonElement(body)

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

