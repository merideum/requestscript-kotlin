package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.ScriptContext

/**
 * A value that has an instance in memory.
 */
interface TypedValue <T> {

  val value: T?

  val type: Type

  fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any?

  fun get(): T?

  fun stringify(): String
}
