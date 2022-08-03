package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.list.IntListValue
import org.merideum.kotlin.merit.interpreter.type.list.ObjectListValue
import org.merideum.kotlin.merit.interpreter.type.list.StringListValue

class MeritObject {
  private val mapping: MutableMap<String, Any?> = mutableMapOf()
  /**
   * The structure of the object.
   * key = the field name
   * value = the field value (int, string, object, list, etc.)
   */
  private val structure = ObjectType()

  fun mapping() = mapping
  fun structure() = structure

  private fun put(key: String, value: Int?) {
    mapping[key] = value

    structure.add(key, IntType())
  }

  operator fun set(key: String, value: Int?) {
    put(key, value)
  }

  private fun put(key: String, value: String?) {
    mapping[key] = value

    structure.add(key, StringType())
  }

  operator fun set(key: String, value: String?) {
    put(key, value)
  }

  private fun put(key: String, value: List<*>, listType: FieldType) {
    mapping[key] = value

    structure.add(key, listType)
  }

  operator fun set(key: String, value: Pair<List<*>, FieldType>) {
    put(key, value.first, value.second)
  }

  private fun put(key: String, value: MeritObject) {
    mapping[key] = value.mapping

    structure.add(key, value.structure())
  }

  operator fun set(key: String, value: MeritObject) {
    put(key, value)
  }

  override fun equals(other: Any?): Boolean {
    if (other !is MeritObject) return false

    return other.structure().get() == structure.get()
  }

  override fun hashCode(): Int {
    var result = mapping.hashCode()
    result = 31 * result + structure.hashCode()
    return result
  }

  fun toObjectValue(): ObjectValue {
    return structure().toTypedValue(mapping)
  }
}

interface FieldType {
  fun toTypedValue(value: Any?): TypedValue<*>
}

class NoFieldType: FieldType {
  override fun toTypedValue(value: Any?): TypedValue<*> {
    throw RuntimeException("Cannot construct TypedValue from NoFieldType.")
  }
}

class ObjectType(
  val structure: MutableMap<String, FieldType> = mutableMapOf()
): FieldType {

  fun get() = structure.toMap()

  override fun toTypedValue(value: Any?): ObjectValue {
    // TODO throw better exception
    if (value !is Map<*, *>) throw Exception("Cannot convert type that is not Map")

    val typedValueMap = mutableMapOf<String, TypedValue<*>>()
    value.forEach { (key, field) ->
      if (key is String) {
        typedValueMap[key] = structure[key]!!.toTypedValue(field)
      }
    }

    // TODO make sure cast succeeds
    return ObjectValue(value as MutableMap<String, Any?>, this)
  }

  fun add(key: String, fieldType: FieldType) {
    structure[key] = fieldType
  }

  override fun equals(other: Any?): Boolean {
    if (other !is ObjectType) return false

    return other.structure == structure
  }

  override fun hashCode(): Int {
    return structure.hashCode()
  }
}

class IntType: FieldType {

  override fun toTypedValue(value: Any?): IntValue {
    // TODO throw better exception
    if (value !is Int) throw Exception("Cannot create IntValue from value $value")

    return IntValue(value)
  }

  override fun equals(other: Any?): Boolean {
    return other is IntType
  }

  override fun hashCode(): Int {
    return javaClass.hashCode()
  }
}

class StringType: FieldType {

  override fun toTypedValue(value: Any?): StringValue {
    // TODO throw better exception
    if (value !is String) throw Exception("Cannot create StringValue from value $value")

    return StringValue(value)
  }

  override fun equals(other: Any?): Boolean {
    return other is StringType
  }

  override fun hashCode(): Int {
    return javaClass.hashCode()
  }
}

class IntListType: FieldType {

  override fun toTypedValue(value: Any?): IntListValue {
    // TODO throw better exceptions
    if (value !is List<*>) throw Exception("Cannot create IntListValue from value $value")

    return IntListValue(value as List<Int>)
  }

  override fun equals(other: Any?): Boolean {
    return other is IntListType
  }

  override fun hashCode(): Int {
    return javaClass.hashCode()
  }
}

class StringListType: FieldType {
  override fun toTypedValue(value: Any?): StringListValue {
    if (value !is List<*>) throw Exception("Cannot create StringListValue from value $value")

    return StringListValue(value as List<String>)
  }

  override fun equals(other: Any?): Boolean {
    return other is StringListType
  }

  override fun hashCode(): Int {
    return javaClass.hashCode()
  }
}

class ObjectListType(val objectTypes: List<ObjectType>): FieldType {
  override fun toTypedValue(value: Any?): ObjectListValue {
    if (value !is List<*>) throw RuntimeException("Cannot create ObjectListValue from value $value")

    val objectValues = value.zip(objectTypes).map { (value, objectType) ->
      objectType.toTypedValue(value)
    }

    return ObjectListValue(objectValues)
  }

  override fun equals(other: Any?): Boolean {
    if (other !is ObjectListType) return false

    return other.objectTypes == objectTypes
  }

  override fun hashCode(): Int {
    return objectTypes.hashCode()
  }
}

fun stringList(value: List<String?>): Pair<List<String?>, StringListType> = Pair(value,
  StringListType()
)

fun intList(value: List<Int?>): Pair<List<Int?>, IntListType> = Pair(value,
  IntListType()
)

fun objectList(
  value: List<MeritObject>
): Pair<List<Map<String, Any?>>, ObjectListType> {
  val mappings = value.map {
    it.mapping()
  }
  val structures = value.map {
    it.structure()
  }

  return Pair(mappings, ObjectListType(structures))
}

fun buildObject(init: MeritObject.() -> Unit): MeritObject {
  val meritObject = MeritObject()
  meritObject.init()

  return meritObject
}
