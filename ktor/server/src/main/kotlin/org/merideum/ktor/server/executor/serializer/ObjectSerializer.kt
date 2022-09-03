package org.merideum.ktor.server.executor.serializer

import org.merideum.server.interpreter.type.MerideumObject

/**
 * Serializes Kotlin class returned from Kotlin function to Map, so it can be used as an object in the Merit code.
 * Deserializes Map to Kotlin class for use as a parameter in a Kotlin class function.
 */
interface ObjectSerializer<T> {
  fun serialize(value: T): MerideumObject

  fun deserialize(value: Map<String, Any?>): T
}
