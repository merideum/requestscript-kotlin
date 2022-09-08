package org.merideum.core.interpreter.type

import org.merideum.core.interpreter.FunctionCallContext

/**
 * A value that has an instance in memory.
 *
 * TValue = the Kotlin value.
 */
interface TypedValue<TValue> {

    val value: TValue?

    val type: Type

    fun callFunction(context: FunctionCallContext): Any?

    /**
     * Gets the Kotlin value stored in the TypedValue
     */
    fun get(): Any?

    fun getValue(): TypedValue<*>

    fun stringify(): String
}
