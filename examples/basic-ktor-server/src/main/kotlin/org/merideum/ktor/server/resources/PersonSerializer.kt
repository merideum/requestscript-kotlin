package org.merideum.ktor.server.resources

import org.merideum.ktor.server.executor.serialization.MerideumSerializer

class PersonSerializer: MerideumSerializer<Person> {
  override fun serialize(value: Person): Map<String, Any?> {
    return mapOf("firstName" to value.firstName, "lastName" to value.lastName)
  }

  override fun deserialize(value: Map<String, Any?>): Person {
    // TODO add deserialize exception
    val firstName = value["firstName"] as? String ?: throw RuntimeException("Could not deserialize 'firstName'")
    val lastName = value["lastName"] as? String ?: throw RuntimeException("Could not deserialize 'lastName'")

    return Person(firstName, lastName)
  }
}
