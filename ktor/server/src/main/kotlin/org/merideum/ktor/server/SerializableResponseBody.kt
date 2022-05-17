package org.merideum.ktor.server

import kotlinx.serialization.json.JsonElement

@kotlinx.serialization.Serializable
data class SerializableResponseBody(
  val output: JsonElement
)
