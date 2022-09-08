package org.merideum.core.interpreter.type.list

import org.merideum.core.interpreter.FunctionCallContext
import org.merideum.core.interpreter.error.FunctionNotFoundException
import org.merideum.core.interpreter.type.TypedValue

interface ListValue<T : TypedValue<R>, R> : TypedValue<List<T>> {

    override fun callFunction(
        context: FunctionCallContext
    ): TypedValue<*> {
        with(context) {
            if (value == null) throw FunctionNotFoundException(functionName, lineNumber, linePosition)

            throw FunctionNotFoundException(functionName, lineNumber, linePosition)
        }
    }

    override fun get(): List<Any?>? {
        return value!!.map { it.get() }
    }

    override fun getValue(): TypedValue<*> {
        return this
    }

    fun get(index: Int): Any? {
        return getValue(index)
    }

    override fun stringify(): String {
        return "[${value?.joinToString { it.stringify() } ?: ""}]"
    }

    fun getValue(index: Int): TypedValue<*>
}
