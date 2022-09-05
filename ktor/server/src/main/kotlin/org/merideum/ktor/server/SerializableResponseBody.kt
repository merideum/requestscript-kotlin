package org.merideum.ktor.server

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

/**
 * If there are no errors, then do not show the 'errors' object. If there are errors, then do not show the 'output' object.
 */
@Serializable
open class SerializableResponseBodyWithOutput(
    val output: JsonElement?
) : SerializableResponseBody

@Serializable
class SerializableResponseBodyWithErrors(
    val errors: JsonElement
) : SerializableResponseBody

interface SerializableResponseBody
