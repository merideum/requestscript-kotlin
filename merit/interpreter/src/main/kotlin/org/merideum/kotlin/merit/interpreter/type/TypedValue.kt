package org.merideum.kotlin.merit.interpreter.type

import org.merideum.kotlin.merit.ScriptContext

/**
 * A value that has an instance in memory.
 *
 * TValue = the Kotlin value.
 */
interface TypedValue <TValue> {

  val value: TValue?

  val type: Type

  fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any?

  fun get(): Any?

  fun stringify(): String
}
