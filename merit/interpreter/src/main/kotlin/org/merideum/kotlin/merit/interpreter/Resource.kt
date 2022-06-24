package org.merideum.kotlin.merit.interpreter

interface Resource {
  /**
   * The name of the Resource
   */
  val name: String

  /**
   * The path of the Resource. The same path and name cannot be shared.
   */
  val path: String
}
