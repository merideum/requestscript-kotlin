package org.merideum.ktor.server.executor

import org.merideum.ktor.server.executor.serialization.MerideumSerializer

@Suppress("UNCHECKED_CAST")
class SerializerResolver(
  val serializers: Map<String, MerideumSerializer<*>>
) {

  inline fun <reified T> resolveOrThrow(instance: T, className: String): MerideumSerializer<T> {

    val found = serializers[className]

    if (found != null) {
      return found as? MerideumSerializer<T> ?: throw RuntimeException("Could not find serializer for $className")
    }

    throw RuntimeException("Could not find serializer for $className")
  }
}
