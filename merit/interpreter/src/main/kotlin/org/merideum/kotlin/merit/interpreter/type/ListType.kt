package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.value.ListValue

class ListType(
  override val innerType: Type
): Type {
  override val value: TypeOption = TypeOption.LIST
  override val kTypeName: String = "List"

  /**
   * TODO needs improvement (reduce assumptions)
   * Since there can only be one type for a list, we can assume this is true and get the first element.
   */
  fun buildInnerType(list: List<*>): Type {
    val type = list::class.typeParameters.first()

    return when (type) {
//      is Int -> IntType()
//      is String -> StringType()
      is List<*> -> ListType(buildInnerType(type))
      else -> ObjectType(type!!::class.qualifiedName ?: "")
    }
  }

  override fun new(value: Any?): ListValue {
    // TODO throw better exception
    if (value !is List<*>) throw RuntimeException("Cannot construct value of type not Int")

    return ListValue(value, innerType)
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) return false

    if (other !is ListType) return false

    if (other.innerType != innerType) return false

    return true
  }

  override fun hashCode(): Int {
    var result = innerType.hashCode()
    result = 31 * result + value.hashCode()
    result = 31 * result + kTypeName.hashCode()
    return result
  }
}
