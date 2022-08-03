package org.merideum.kotlin.merit.interpreter.type

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.kotlin.merit.interpreter.type.list.IntListValue
import org.merideum.kotlin.merit.interpreter.type.list.ObjectListValue
import org.merideum.kotlin.merit.interpreter.type.list.StringListValue

class ObjectStructureTests : DescribeSpec({
  fun FieldType.shouldConvertToTypedValue(value: Any?, expectedTypedValue: TypedValue<*>) {
    toTypedValue(value) shouldBe expectedTypedValue
  }

  describe("MeritObject") {
    it("should build MeritObject") {
      val actual = buildObject {
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

      val valueMap = mutableMapOf<String, Any?>(
        "int" to 123,
        "string" to "Bar",
        "object" to mutableMapOf("int2" to 456),
      "intList" to listOf(789),
      "stringList" to listOf("foobar"),
      "objectList" to listOf(
        mutableMapOf("int3" to 101112),
        mutableMapOf("int4" to 131415)
      ))

      val fieldTypeMap = mutableMapOf(
        "int" to IntType(),
        "string" to StringType(),
        "object" to ObjectType(mutableMapOf("int2" to IntType())),
        "intList" to IntListType(),
        "stringList" to StringListType(),
        "objectList" to ObjectListType(
          listOf(
            ObjectType(mutableMapOf("int3" to IntType())),
            ObjectType(mutableMapOf("int4" to IntType()))
          )
        )
      )

      val expectedObjectValue = ObjectValue(valueMap, ObjectType(fieldTypeMap))

      actual.toObjectValue() shouldBe expectedObjectValue
    }
  }

  describe("IntType") {
    it("should populate int field") {
      val objectStructure = buildObject {
        this["foo"] = 123
      }

      objectStructure.mapping() shouldBe mapOf("foo" to 123)
      objectStructure.structure().get() shouldBe mapOf("foo" to IntType())
    }

    it("should convert to IntValue") {
      val expected = IntValue(20)

      IntType().shouldConvertToTypedValue(20, expected)
    }
  }

  describe("StringType") {
    it("should populate string field") {
      val objectStructure = buildObject {
        this["foo"] = "bar"
      }

      objectStructure.mapping() shouldBe mapOf("foo" to "bar")
      objectStructure.structure().get() shouldBe mapOf("foo" to StringType())
    }

    it("should convert to StringValue") {
      val expected = StringValue("asdf")

      StringType().shouldConvertToTypedValue("asdf", expected)
    }
  }

  describe("ObjectType") {
    it("should populate object field") {
      val objectStructure = buildObject {
        this["foo"] = buildObject {
          this["bar"] = 123
        }
      }

      objectStructure.mapping() shouldBe mapOf("foo" to mapOf("bar" to 123))
      objectStructure.structure().get() shouldBe mapOf("foo" to ObjectType(mutableMapOf("bar" to IntType())))
    }

    it("should convert to ObjectValue") {
      val structure = mutableMapOf<String, FieldType>("foo" to StringType())
      val expected = ObjectValue(mutableMapOf("foo" to StringValue("bar")), ObjectType(structure))

      ObjectType(structure).shouldConvertToTypedValue(mutableMapOf("foo" to "bar"), expected)
    }
  }

  describe("list") {
    describe("IntListType") {
      it("should populate int list field") {
        val objectStructure = buildObject {
          this["foo"] = intList(listOf(123))
        }

        objectStructure.mapping() shouldBe mapOf("foo" to listOf(123))
        objectStructure.structure().get() shouldBe mapOf("foo" to IntListType())
      }

      it("should convert to IntListValue") {
        val listValue = listOf(123)
        val expected = IntListValue(listValue)

        IntListType().shouldConvertToTypedValue(listValue, expected)
      }
    }

    describe("StringListType") {
      it("should populate string list field") {
        val objectStructure = buildObject {
          this["foo"] = stringList(listOf("asdf"))
        }

        objectStructure.mapping() shouldBe mapOf("foo" to listOf("asdf"))
        objectStructure.structure().get() shouldBe mapOf("foo" to StringListType())
      }

      it("should convert to StringListValue") {
        val listValue = listOf("123")
        val expected = StringListValue(listValue)

        StringListType().shouldConvertToTypedValue(listValue, expected)
      }
    }

    describe("ObjectListType") {
      it("should populate object list field") {
        val expectedStructure = mutableMapOf<String, FieldType>(
          "foo" to ObjectListType(
            listOf(
              ObjectType(mutableMapOf("bar" to StringType()))
            )
          )
        )

        val objectStructure = buildObject {
          val objects = mutableListOf<MeritObject>()

          objects.add(buildObject { this["bar"] = "asdf" })

          this["foo"] = objectList(objects)
        }

        objectStructure.mapping() shouldBe mapOf("foo" to listOf(mapOf("bar" to "asdf")))
        objectStructure.structure() shouldBe ObjectType(expectedStructure)
      }

      it("should convert to ObjectListValue") {
        val objectStructure = ObjectType(mutableMapOf("foo" to StringType()))
        val listValue = listOf(ObjectValue(mutableMapOf("foo" to StringValue("bar")), objectStructure))
        val expected = ObjectListValue(listValue)

        ObjectListType(listOf(objectStructure)).shouldConvertToTypedValue(listOf(mapOf("foo" to "bar")), expected)
      }
    }
  }
})
