package org.merideum.kotlin.merit.interpreter

import org.merideum.kotlin.merit.interpreter.type.ResourceType
import org.merideum.kotlin.merit.interpreter.type.value.TypedValue

abstract class Resource<T>: TypedValue<T> {
  /**
   * The name of the Resource
   */
  abstract val name: String

  /**
   * The path of the Resource. The same path and name cannot be shared.
   */
  abstract val path: String

  override val type = ResourceType()

  override fun stringify(): String {
    // TODO throw better exception.
    throw RuntimeException("Cannot use Resource as 'string'.")
  }
}
