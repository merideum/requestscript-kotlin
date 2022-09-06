package org.merideum.core.interpreter.type

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.core.interpreter.type.list.IntListValue
import org.merideum.core.interpreter.type.list.ObjectListValue
import org.merideum.core.interpreter.type.list.StringListValue

class ValueBuilderTests : DescribeSpec({
    lateinit var merideumObject: MerideumObject

    infix fun MerideumObject.shouldHaveValue(value: MutableMap<String, TypedValue<*>>) {
        this.getObjectValue() shouldBe ObjectValue(value)
    }

    infix fun MerideumObject.shouldHaveValue(value: ObjectValue) {
        this.getObjectValue() shouldBe value
    }

    describe("MerideumObject") {
        it("should build MerideumObject") {
            merideumObject = buildObject {
                this["int"] = 123

                this["string"] = "Bar"

                this["object"] = buildObject {
                    this["int2"] = 456
                }

                this["intList"] = intList(listOf(789))

                this["stringList"] = stringList(listOf("foobar"))

                this["objectList"] = objectList(
                    listOf(
                        buildObject {
                            this["int3"] = 101112
                        },
                        buildObject {
                            this["int4"] = 131415
                        }
                    )
                )
            }

            val valueMap = mutableMapOf<String, TypedValue<*>>(
                "int" to IntValue(123),
                "string" to StringValue("Bar"),
                "object" to ObjectValue(mutableMapOf("int2" to IntValue(456))),
                "intList" to IntListValue(listOf(IntValue(789))),
                "stringList" to StringListValue(listOf(StringValue("foobar"))),
                "objectList" to ObjectListValue(
                    listOf(
                        ObjectValue(mutableMapOf("int3" to IntValue(101112))),
                        ObjectValue(mutableMapOf("int4" to IntValue(131415)))
                    )
                )
            )

            val expectedObjectValue = ObjectValue(valueMap)

            merideumObject shouldHaveValue expectedObjectValue
        }
    }

    describe("IntType") {
        it("should populate int field") {
            merideumObject = buildObject {
                this["foo"] = 123
            }

            merideumObject shouldHaveValue mutableMapOf("foo" to IntValue(123))
        }
    }

    describe("StringType") {
        it("should populate string field") {
            merideumObject = buildObject {
                this["foo"] = "bar"
            }

            merideumObject shouldHaveValue mutableMapOf("foo" to StringValue("bar"))
        }
    }

    describe("Object") {
        it("should populate object field") {
            merideumObject = buildObject {
                this["foo"] = buildObject {
                    this["bar"] = 123
                }
            }

            merideumObject shouldHaveValue mutableMapOf("foo" to ObjectValue(mutableMapOf("bar" to IntValue(123))))
        }
    }

    describe("list") {
        describe("Int List") {
            it("should populate int list field") {
                merideumObject = buildObject {
                    this["foo"] = intList(listOf(123))
                }

                merideumObject shouldHaveValue mutableMapOf("foo" to IntListValue(listOf(IntValue(123))))
            }
        }

        describe("String List") {
            it("should populate string list field") {
                merideumObject = buildObject {
                    this["foo"] = stringList(listOf("asdf"))
                }

                merideumObject shouldHaveValue mutableMapOf("foo" to StringListValue(listOf(StringValue("asdf"))))
            }
        }

        describe("Object List") {
            it("should populate object list field") {
                merideumObject = buildObject {
                    val objects = mutableListOf<MerideumObject>()

                    objects.add(buildObject { this["bar"] = "asdf" })

                    this["foo"] = objectList(objects)
                }

                merideumObject shouldHaveValue mutableMapOf(
                    "foo" to ObjectListValue(
                        listOf(
                            ObjectValue(
                                mutableMapOf(
                                    "bar" to StringValue(
                                        "asdf"
                                    )
                                )
                            )
                        )
                    )
                )
            }
        }
    }
})
