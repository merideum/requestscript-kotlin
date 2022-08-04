package org.merideum.kotlin.merit.interpreter.utils

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.TypedValue

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
  }
