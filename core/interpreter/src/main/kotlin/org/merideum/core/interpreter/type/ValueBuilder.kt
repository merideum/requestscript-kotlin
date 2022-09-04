package org.merideum.core.interpreter.type

import org.merideum.core.interpreter.type.list.IntListValue
import org.merideum.core.interpreter.type.list.ListValue
import org.merideum.core.interpreter.type.list.ObjectListValue
import org.merideum.core.interpreter.type.list.StringListValue

/**
 * Classes in this file are used to build Merideum represented values from Kotlin
 */
class MerideumObject {
  private val values: MutableMap<String, TypedValue<*>> = mutableMapOf()

  operator fun set(key: String, value: Int?) {
    values[key] = IntValue(value)
  }

  operator fun set(key: String, value: String?) {
    values[key] = StringValue(value)
  }

  operator fun set(key: String, value: ListValue<*, *>) {
    values[key] = value
  }

  operator fun set(key: String, value: MerideumObject) {
    values[key] = ObjectValue(value.values)
  }

  override fun equals(other: Any?): Boolean {
    if (other !is MerideumObject) return false

    return other.values == values
  }

  fun getObjectValue() = ObjectValue(values)

  override fun hashCode(): Int {
    return values.hashCode()
  }
}

fun stringList(value: List<String>): StringListValue = StringListValue(value.map { StringValue(it) })

fun intList(value: List<Int>): IntListValue = IntListValue(value.map { IntValue(it) })

fun objectList(
  value: List<MerideumObject>
): ObjectListValue {

  return ObjectListValue(value.map { it.getObjectValue() })
}

fun buildObject(init: MerideumObject.() -> Unit): MerideumObject {
  val merideumObject = MerideumObject()
  merideumObject.init()

  return merideumObject
}
