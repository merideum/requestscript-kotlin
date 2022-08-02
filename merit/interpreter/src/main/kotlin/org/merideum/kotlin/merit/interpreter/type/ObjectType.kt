package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.value.IntValue
import org.merideum.kotlin.merit.interpreter.type.value.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.value.TypedValue
import java.util.Objects

class ObjectType(
  override val kTypeName: String = ""
): Type {
  override val value: TypeOption = TypeOption.OBJECT
  override val innerType: Type? = null

  override fun new(value: Any?): ObjectValue {
    // TODO throw better exception
    if (value !is Map<*, *>?) throw RuntimeException("Cannot construct value of type not Int")

    val castedValue = value as? Map<String, TypedValue<*>>

    return ObjectValue(castedValue?.toMutableMap())
  }

//  private fun newFromStructure(map: Map<String, Any?>): ObjectValue {
//
//  }

  override fun equals(other: Any?): Boolean {
    if (other == null) return false

    if (other !is ObjectType) return false

    if (other.kTypeName != kTypeName) return false

    return true
  }

  override fun hashCode(): Int {
    var result = kTypeName.hashCode()
    result = 31 * result + value.hashCode()
    result = 31 * result + (innerType?.hashCode() ?: 0)
    return result
  }
}
