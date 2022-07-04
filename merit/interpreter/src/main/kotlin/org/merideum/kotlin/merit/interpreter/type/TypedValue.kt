package org.merideum.kotlin.merit.interpreter.type

/**
 * A value that has an instance in memory.
 */
interface TypedValue <T> {

  val value: T?

  val type: Type

  fun callFunction(functionName: String, parameters: List<*>): Any?

  fun get(): T?
}
