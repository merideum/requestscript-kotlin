package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.value.IntValue

class IntType: Type {
  override val value: TypeOption = TypeOption.INT
  override val kTypeName: String = "Int"
  override val innerType: Type? = null

  override fun new(value: Any?): IntValue {
    // TODO throw better exception
    if (value !is Int) throw RuntimeException("Cannot construct value of type not Int")
    return IntValue(value)
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) return false

    if (other !is IntType) return false

    return true
  }

  override fun hashCode(): Int {
    var result = value.hashCode()
    result = 31 * result + kTypeName.hashCode()
    result = 31 * result + (innerType?.hashCode() ?: 0)
    return result
  }
}
