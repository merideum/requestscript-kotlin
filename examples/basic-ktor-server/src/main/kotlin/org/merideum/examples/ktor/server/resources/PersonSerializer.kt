@file:Suppress("TooGenericExceptionThrown")

package org.merideum.examples.ktor.server.resources

//class PersonSerializer : ObjectSerializer<Person> {
//    override fun serialize(value: Person): MerideumObject {
//        return buildObject {
//            this["firstName"] = value.firstName
//            this["lastName"] = value.lastName
//        }
//    }
//
//    override fun deserialize(value: Map<String, Any?>): Person {
//        // TODO add deserialize exception
//        val firstName = value["firstName"] as? String ?: throw RuntimeException("Could not deserialize 'firstName'")
//        val lastName = value["lastName"] as? String ?: throw RuntimeException("Could not deserialize 'lastName'")
//
//        return Person(firstName, lastName)
//    }
//}
