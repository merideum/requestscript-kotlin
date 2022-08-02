package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.interpreter.type.value.TypedValue

class ResourceType: Type {
  override val value: TypeOption = TypeOption.RESOURCE
  override val kTypeName: String = ""
  override val innerType: Type? = null

  override fun new(value: Any?): TypedValue<*> {
    // TODO throw better exception
    throw RuntimeException("Cannot construct a new Resource")
  }
}
