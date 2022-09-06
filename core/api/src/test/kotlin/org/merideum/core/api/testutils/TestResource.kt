package org.merideum.core.api.testutils

import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.type.StringValue
import org.merideum.core.interpreter.type.TypedValue

class TestResource<T>(override val name: String, override val path: String, override val value: T?) : Resource<T> {

    override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any? {

        if (functionName == "sayHello") {
            if (parameters.isEmpty()) {
                return StringValue("Hello!")
            }

            if (parameters.size == 1) {
                return StringValue("Hello ${parameters.single().get()}!")
            }
        }

        throw TestResourceException("could not call function of test resource")
    }

    override fun get(): T? {
        return value
    }

    override fun getValue(): TypedValue<*> {
        throw TestResourceException("Cannot get value of Resource")
    }
}

class TestResourceException(override val message: String?) : RuntimeException()
