package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.value.IntValue
import org.merideum.kotlin.merit.interpreter.type.value.StringValue
import org.merideum.kotlin.merit.interpreter.type.value.TypedValue

/**
 * Representation of a Merit type. Can have an inner type (usually in the case of a list).
 */
interface Type {
  val value: TypeOption
  val kTypeName: String
  val innerType: Type?

  fun new(value: Any?): TypedValue<*>

  fun qualifiedTypeName(): String {
    return buildString {
      append(value.typeName())

      if (innerType != null) {
        append("<")
        append(innerType!!.qualifiedTypeName())
        append(">")
      }
    }
  }

  companion object {
    fun fromKey(key: String) = when(key) {
      "int" -> IntType()
      "string" -> StringType()
      else -> ObjectType("")
    }
  }
}
