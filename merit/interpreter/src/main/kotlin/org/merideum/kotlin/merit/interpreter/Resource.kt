package org.merideum.kotlin.merit.interpreter

import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypedValue

interface Resource<T>: TypedValue<T> {
  /**
   * The name of the Resource
   */
  val name: String

  /**
   * The path of the Resource. The same path and name cannot be shared.
   */
  val path: String

  override val type: Type
    get() = Type.RESOURCE

  override fun stringify(): String {
    // TODO throw better exception.
    throw RuntimeException("Cannot use Resource as 'string'.")
  }
}
