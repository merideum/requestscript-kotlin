package org.merideum.ktor.server.executor.serializer

import org.merideum.kotlin.merit.interpreter.type.MeritObject

/**
 * Serializes Kotlin class returned from Kotlin function to Map, so it can be used as an object in the Merit code.
 * Deserializes Map to Kotlin class for use as a parameter in a Kotlin class function.
 */
interface ObjectSerializer<T> {
  fun serialize(value: T): MeritObject

  fun deserialize(value: Map<String, Any?>): T
}
