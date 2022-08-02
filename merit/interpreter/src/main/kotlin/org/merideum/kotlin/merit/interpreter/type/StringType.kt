package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.value.StringValue

class StringType: Type {
  override val value: TypeOption = TypeOption.STRING
  override val kTypeName: String = "String"
  override val innerType: Type? = null

  override fun new(value: Any?): StringValue {
    // TODO throw better exception
    if (value !is String) throw RuntimeException("Cannot construct value of type not Int")
    return StringValue(value)
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) return false

    if (other !is StringType) return false

    return true
  }

  override fun hashCode(): Int {
    var result = value.hashCode()
    result = 31 * result + kTypeName.hashCode()
    result = 31 * result + (innerType?.hashCode() ?: 0)
    return result
  }
}
