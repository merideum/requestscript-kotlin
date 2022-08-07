package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.list.IntListValue
import org.merideum.kotlin.merit.interpreter.type.list.ListValue
import org.merideum.kotlin.merit.interpreter.type.list.ObjectListValue
import org.merideum.kotlin.merit.interpreter.type.list.StringListValue

/**
 * Classes in this file are used to build Merit represented values from Kotlin
 */
class MeritObject {
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

  operator fun set(key: String, value: MeritObject) {
    values[key] = ObjectValue(value.values)
  }

  override fun equals(other: Any?): Boolean {
    if (other !is MeritObject) return false

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
  value: List<MeritObject>
): ObjectListValue {

  return ObjectListValue(value.map { it.getObjectValue() })
}

fun buildObject(init: MeritObject.() -> Unit): MeritObject {
  val meritObject = MeritObject()
  meritObject.init()

  return meritObject
}
