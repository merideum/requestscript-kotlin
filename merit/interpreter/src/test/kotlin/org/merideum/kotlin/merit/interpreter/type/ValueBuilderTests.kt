package org.merideum.kotlin.merit.interpreter.type

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.kotlin.merit.interpreter.type.list.IntListValue
import org.merideum.kotlin.merit.interpreter.type.list.ObjectListValue
import org.merideum.kotlin.merit.interpreter.type.list.StringListValue

class ValueBuilderTests : DescribeSpec({
  lateinit var meritObject: MeritObject

  infix fun MeritObject.shouldHaveValue(value: MutableMap<String, TypedValue<*>>) {
    this.getObjectValue() shouldBe ObjectValue(value)
  }

  infix fun MeritObject.shouldHaveValue(value: ObjectValue) {
    this.getObjectValue() shouldBe value
  }

  describe("MeritObject") {
    it("should build MeritObject") {
      meritObject = buildObject {
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
        "intList" to IntListValue(listOf(789)),
        "stringList" to StringListValue(listOf("foobar")),
        "objectList" to ObjectListValue(listOf(
          ObjectValue(mutableMapOf("int3" to IntValue(101112))),
          ObjectValue(mutableMapOf("int4" to IntValue(131415)))
          )
        )
      )

      val expectedObjectValue = ObjectValue(valueMap)

      meritObject shouldHaveValue expectedObjectValue
    }
  }

  describe("IntType") {
    it("should populate int field") {
      meritObject = buildObject {
        this["foo"] = 123
      }

      meritObject shouldHaveValue mutableMapOf("foo" to IntValue(123))
    }
  }

  describe("StringType") {
    it("should populate string field") {
      meritObject = buildObject {
        this["foo"] = "bar"
      }

      meritObject shouldHaveValue mutableMapOf("foo" to StringValue("bar"))
    }
  }

  describe("Object") {
    it("should populate object field") {
      meritObject = buildObject {
        this["foo"] = buildObject {
          this["bar"] = 123
        }
      }

      meritObject shouldHaveValue mutableMapOf("foo" to ObjectValue(mutableMapOf("bar" to IntValue(123))))
    }
  }

  describe("list") {
    describe("Int List") {
      it("should populate int list field") {
        meritObject = buildObject {
          this["foo"] = intList(listOf(123))
        }

        meritObject shouldHaveValue mutableMapOf("foo" to IntListValue(listOf(123)))
      }
    }

    describe("String List") {
      it("should populate string list field") {
        meritObject = buildObject {
          this["foo"] = stringList(listOf("asdf"))
        }

        meritObject shouldHaveValue mutableMapOf("foo" to StringListValue(listOf("asdf")))
      }
    }

    describe("Object List") {
      it("should populate object list field") {
        meritObject = buildObject {
          val objects = mutableListOf<MeritObject>()

          objects.add(buildObject { this["bar"] = "asdf" })

          this["foo"] = objectList(objects)
        }

        meritObject shouldHaveValue mutableMapOf("foo" to ObjectListValue(listOf(ObjectValue(mutableMapOf("bar" to StringValue("asdf"))))))
      }
    }
  }
})
