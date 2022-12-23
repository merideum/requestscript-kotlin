package org.merideum.ktor.server

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.double
import kotlinx.serialization.json.doubleOrNull
import kotlinx.serialization.json.int
import kotlinx.serialization.json.intOrNull
import kotlinx.serialization.json.long
import kotlinx.serialization.json.longOrNull
import java.lang.IllegalArgumentException

fun jsonObjectToMap(jsonObject: JsonObject): Map<String, Any?> {
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
            jsonObjectToMap(value)
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
