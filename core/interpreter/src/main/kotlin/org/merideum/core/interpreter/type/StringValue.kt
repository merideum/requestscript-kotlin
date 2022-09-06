package org.merideum.core.interpreter.type

import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.error.FunctionNotFoundException

data class StringValue(override val value: String?) : TypedValue<String> {

    override val type = Type.STRING

    override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any {
        if (value == null) throw FunctionNotFoundException(functionName)

        if (functionName == "length" && parameters.isEmpty()) {

            /**
             * We need to rewrap the value as an [IntValue].
             */
            return IntValue(value.length)
        }

        throw FunctionNotFoundException(functionName)
    }

    override fun get(): String? {
        return value
    }

    override fun getValue(): TypedValue<*> {
        return this
    }

    override fun stringify(): String {
        return value.toString()
    }
}
