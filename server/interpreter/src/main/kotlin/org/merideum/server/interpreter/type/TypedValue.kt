package org.merideum.server.interpreter.type

import org.merideum.server.interpreter.ScriptContext

/**
 * A value that has an instance in memory.
 *
 * TValue = the Kotlin value.
 */
interface TypedValue <TValue> {

  val value: TValue?

  val type: Type

  fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any?

  /**
   * Gets the Kotlin value stored in the TypedValue
   */
  fun get(): Any?

  fun getValue(): TypedValue<*>

  fun stringify(): String
}
