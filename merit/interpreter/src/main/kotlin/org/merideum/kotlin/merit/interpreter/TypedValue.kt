package org.merideum.kotlin.merit.interpreter

/**
 * A value that has an instance in memory.
 */
interface TypedValue <T> {

  val value: T?

  fun callFunction(functionName: String, parameters: List<*>): Any?

  fun get(): T?
}
