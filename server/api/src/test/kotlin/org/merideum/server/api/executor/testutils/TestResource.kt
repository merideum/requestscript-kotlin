package org.merideum.server.api.executor.testutils

import org.merideum.server.interpreter.ScriptContext
import org.merideum.server.interpreter.Resource
import org.merideum.server.interpreter.type.StringValue
import org.merideum.server.interpreter.type.TypedValue

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

      return null
    }

    override fun get(): T? {
      return value
    }

  override fun getValue(): TypedValue<*> {
    // TODO throw better exception
    throw RuntimeException("Cannot get value of Resource")
  }
}
