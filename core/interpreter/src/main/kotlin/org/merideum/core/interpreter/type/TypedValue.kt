package org.merideum.core.interpreter.type

import org.merideum.core.interpreter.ScriptContext

/**
 * A value that has an instance in memory.
 *
 * TValue = the Kotlin value.
 */
interface TypedValue<TValue> {

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
