package org.merideum.core.interpreter.type

import org.merideum.core.interpreter.FunctionCallContext
import org.merideum.core.interpreter.error.FunctionNotFoundException

data class ObjectValue(override val value: MutableMap<String, TypedValue<*>>?) :
    TypedValue<MutableMap<String, TypedValue<*>>> {

    override val type = Type.OBJECT

    override fun callFunction(context: FunctionCallContext): Any? {
        with(context) {
            if (value == null) throw FunctionNotFoundException(functionName, lineNumber, linePosition)

            throw FunctionNotFoundException(functionName, lineNumber, linePosition)
        }
    }

    override fun get(): MutableMap<String, Any?>? {
        if (value == null) return null

        val newMap = mutableMapOf<String, Any?>()

        value.forEach { (key, value) ->
            newMap[key] = value.get()
        }

        return newMap
    }

    override fun getValue(): TypedValue<*> {
        return this
    }

    // TODO map the fields without TypedValue wrappers.
    override fun stringify(): String {
        return buildString {
            append("{")
            value?.forEach { (key, keyValue) ->
                append(key)
                append("=")
                append(keyValue.stringify())
                append(",")
            }
            // Remove last comma
            replace(length - 1, length, "")
            append("}")
        }
    }

    fun getField(name: String): TypedValue<*> {
        // TODO throw exception if a structure entry is not found for the value entry (there always should be one)
        return value!![name]!!
    }

    fun setField(key: String, fieldValue: TypedValue<*>) {
        value!![key] = fieldValue
    }

    override fun toString(): String {
        return stringify()
    }
}
