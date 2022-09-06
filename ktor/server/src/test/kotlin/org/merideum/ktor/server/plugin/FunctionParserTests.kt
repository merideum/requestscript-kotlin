@file:Suppress("UnusedPrivateMember")

package org.merideum.ktor.server.plugin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.core.api.serializer.ObjectSerializer
import org.merideum.core.interpreter.type.MerideumObject
import org.merideum.core.interpreter.type.Type
import kotlin.reflect.KParameter
import kotlin.reflect.full.declaredMemberFunctions

class FunctionParserTests : DescribeSpec({

    describe("functionsForInstance") {
        it("function with many parameters") {
            val instance = Foo()

            val doThingFunction = Foo()::class.declaredMemberFunctions.single { it.name == "doThing" }

            val expected = mapOf(
                "doThing-string-int" to ResourceFunction(
                    "doThing",
                    listOf(
                        FunctionParameter(
                            null,
                            doThingFunction.parameters.single { it.kind == KParameter.Kind.INSTANCE }
                        ),
                        FunctionParameter(
                            FunctionType(Type.STRING, "String"),
                            doThingFunction.parameters.single { it.name == "name" }
                        ),
                        FunctionParameter(
                            FunctionType(Type.INT, "Int"),
                            doThingFunction.parameters.single { it.name == "thing" }
                        )
                    ),
                    FunctionType(Type.OBJECT, "org.merideum.ktor.server.plugin.Bar"),
                    doThingFunction
                )
            )

            val actualFunctions = FunctionParser(emptyMap()).functionsForInstance(instance)

            actualFunctions shouldBe expected
        }

        it("should map list parameters and return values") {
            val instance = TestList()
            val fooSerializer = FooSerializer()

            val checkListsFunction = TestList()::class.declaredMemberFunctions.single { it.name == "checkLists" }

            val expected = mapOf(
                "checkLists-[int]-[string]-[object]" to ResourceFunction(
                    "checkLists",
                    listOf(
                        FunctionParameter(
                            null,
                            checkListsFunction.parameters.single { it.kind == KParameter.Kind.INSTANCE }
                        ),
                        FunctionParameter(
                            FunctionType(Type.LIST_INT, "List<Int>", Type.INT),
                            checkListsFunction.parameters.single { it.name == "intList" }
                        ),
                        FunctionParameter(
                            FunctionType(Type.LIST_STRING, "List<String>", Type.STRING),
                            checkListsFunction.parameters.single { it.name == "stringList" }
                        ),
                        FunctionParameter(
                            FunctionType(
                                Type.LIST_OBJECT,
                                "List<org.merideum.ktor.server.plugin.Foo>",
                                Type.OBJECT,
                                fooSerializer
                            ),
                            checkListsFunction.parameters.single { it.name == "objectList" }
                        )
                    ),
                    FunctionType(Type.LIST_STRING, "List<String>", Type.STRING),
                    checkListsFunction
                )
            )

            val actualFunctions =
                FunctionParser(mapOf("org.merideum.ktor.server.plugin.Foo" to fooSerializer)).functionsForInstance(
                    instance
                )

            actualFunctions shouldBe expected
        }
    }
})

class Bar(val asdf: String)
class Foo {
    fun doThing(name: String, thing: Int) = Bar("asdf")
}

class FooSerializer : ObjectSerializer<Foo> {
    override fun serialize(value: Foo): MerideumObject {
        TODO("Not yet implemented")
    }

    override fun deserialize(value: Map<String, Any?>): Foo {
        TODO("Not yet implemented")
    }
}

class TestList {
    fun checkLists(intList: List<Int>, stringList: List<String>, objectList: List<Foo>) = listOf("asdf")
}
