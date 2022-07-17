package org.merideum.ktor.server.executor

import org.merideum.ktor.server.executor.serializer.ObjectSerializer

@Suppress("UNCHECKED_CAST")
class SerializerResolver(
  val serializers: Map<String, ObjectSerializer<*>>
) {

  inline fun <reified T> resolveOrThrow(instance: T, className: String): ObjectSerializer<T> {

    val found = serializers[className]

    if (found != null) {
      return found as? ObjectSerializer<T> ?: throw RuntimeException("Could not find serializer for $className")
    }

    throw RuntimeException("Could not find serializer for $className")
  }
}
