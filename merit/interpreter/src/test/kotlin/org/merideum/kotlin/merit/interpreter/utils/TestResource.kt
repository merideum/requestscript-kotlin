package org.merideum.kotlin.merit.interpreter.utils

import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.type.StringValue

class TestResource<T>(override val name: String, override val path: String, override val value: T?) : Resource<T> {
    override fun callFunction(functionName: String, parameters: List<*>): Any? {

      if (functionName == "sayHello") {
        if (parameters.isEmpty()) {
          return StringValue("Hello!")
        }

        if (parameters.size == 1) {
          return StringValue("Hello ${parameters.single()}!")
        }
      }

      return null
    }

    override fun get(): T? {
      return value
    }
  }
