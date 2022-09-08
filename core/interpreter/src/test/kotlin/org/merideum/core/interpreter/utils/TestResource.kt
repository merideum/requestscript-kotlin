package org.merideum.core.interpreter.utils

import org.merideum.core.interpreter.FunctionCallContext
import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.type.StringValue
import org.merideum.core.interpreter.type.TypedValue

class TestResource<T>(override val name: String, override val path: String, override val value: T?) : Resource<T> {

    override fun callFunction(context: FunctionCallContext): Any? {
        with(context) {
            if (functionName == "sayHello") {
                if (parameters.isEmpty()) {
                    return StringValue("Hello!")
                }

                if (parameters.size == 1) {
                    return StringValue("Hello ${parameters.single().get()}!")
                }
            }
        }

        throw TestResourceException()
    }

    override fun get(): T? {
        return value
    }

    override fun getValue(): TypedValue<*> {
        throw IllegalCallerException("Cannot get value of Resource")
    }
}

class TestResourceException(override val message: String? = null) : RuntimeException()
