@file:Suppress("TooGenericExceptionThrown")

package org.merideum.ktor.server.resource

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.antlr.v4.runtime.RuleContext
import org.merideum.core.api.serializer.ObjectSerializer
import org.merideum.core.interpreter.FunctionCallContext
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.type.IntValue
import org.merideum.core.interpreter.type.MerideumObject
import org.merideum.core.interpreter.type.ObjectValue
import org.merideum.core.interpreter.type.StringValue
import org.merideum.core.interpreter.type.buildObject
import org.merideum.ktor.server.plugin.FunctionParser

class InternalResourceTests : DescribeSpec({
    val instance = HelloWorldService()

    val variable = InternalResource(
        "test",
        "org.merideum",
        instance,
        FunctionParser(
            mapOf(
                "org.merideum.ktor.server.resource.Person" to PersonSerializer(),
                "org.merideum.ktor.server.resource.Greeting" to GreetingSerializer()
            )
        ).functionsForInstance(instance)
    )

    val context = ScriptContext()

    describe("callFunction") {
        var functionContext = FunctionCallContext("sayHello", emptyList(), context, RuleContext.EMPTY)

        it("should resolve and call function") {
            variable.callFunction(functionContext).get() shouldBe "Hello World!"
        }

        describe("callFunction() with a parameter") {
            it("should resolve and use parameter passed in") {
                functionContext = FunctionCallContext(
                    "sayHello",
                    listOf(StringValue("Merideum")),
                    context,
                    RuleContext.EMPTY
                )

                variable.callFunction(functionContext).get() shouldBe "Hello Merideum!"
            }
        }

        describe("callFunction() with many parameters") {
            it("should resolve and use parameters passed in") {
                functionContext = FunctionCallContext(
                    "guessAge",
                    listOf(StringValue("Merideum"), IntValue(0)),
                    context,
                    RuleContext.EMPTY
                )

                variable.callFunction(functionContext).get() shouldBe "Hello Merideum! Are you 0 years old?"
            }
        }

        describe("parameter is a class with a serializer") {
            it("should resolve and call function with deserialized parameter") {
                functionContext = FunctionCallContext(
                    "sayHello",
                    listOf(ObjectValue(mutableMapOf("name" to StringValue("Merideum")))),
                    context,
                    RuleContext.EMPTY
                )

                variable.callFunction(functionContext).get() shouldBe "Hello Merideum"
            }
        }

        describe("return type is a class with a serializer") {
            it("should resolve and call function returning serialized value") {
                functionContext = FunctionCallContext(
                    "greet",
                    listOf(StringValue("Merideum")),
                    context,
                    RuleContext.EMPTY
                )

                variable.callFunction(functionContext).get() shouldBe mapOf("message" to "Hello Merideum")
            }
        }
    }
})

data class Person(val name: String)

class PersonSerializer : ObjectSerializer<Person> {
    override fun serialize(value: Person): MerideumObject {
        return buildObject { this["name"] = value.name }
    }

    override fun deserialize(value: Map<String, Any?>): Person {
        val name: String = value["name"] as? String ?: throw RuntimeException("Could not get 'name' from map")

        return Person(name)
    }
}

data class Greeting(val message: String)

class GreetingSerializer : ObjectSerializer<Greeting> {
    override fun serialize(value: Greeting): MerideumObject {
        return buildObject { this["message"] = value.message }
    }

    override fun deserialize(value: Map<String, Any?>): Greeting {
        val message: String = value["message"] as? String ?: throw RuntimeException("Could not get 'message' from map")

        return Greeting(message)
    }
}

class HelloWorldService {
    private val helloWorld = "Hello World!"

    fun sayHello() = helloWorld
    fun sayHello(name: String) = "Hello $name!"

    fun sayHello(person: Person) = "Hello ${person.name}"

    fun guessAge(name: String, age: Int) = "Hello $name! Are you $age years old?"

    fun greet(name: String) = Greeting("Hello $name")
}
