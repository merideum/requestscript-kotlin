package org.merideum.ktor.server.executor

import org.merideum.kotlin.merit.interpreter.Resource
import kotlin.reflect.KVisibility

class InternalResource<T>(
  override val name: String,
  override val path: String,
  override val value: T
) : Resource<T> {

  override fun get(): T? {
    throw Exception("Cannot get a Resource.")
  }
  override fun callFunction(functionName: String, parameters: List<*>): Any? {
    val foundFunction = value!!::class.members.firstOrNull { member ->

      /**
       * to find the correct function we have to match on its name, visibility,
       * and that the number of parameters (minus instance parameter) equal the number of parameters passed in by the caller
       */
      member.name == functionName && member.visibility == KVisibility.PUBLIC && member.parameters.size - 1 == parameters.size
    }

    if (foundFunction != null) {
      val reflectedParameters = foundFunction.parameters

      /**
       * Functions in Kotlin reflection take an instance parameter first.
       */
      val calledParametersAndInstance = listOf(value) + parameters

      /**
       * Associate the parameters passed by the caller with the parameters of the function.
       */
      val functionParameters = reflectedParameters
        .zip(calledParametersAndInstance)
        .toMap()

      if (reflectedParameters.size == calledParametersAndInstance.size) {
        return foundFunction.callBy(functionParameters)
      }
    }

    return null
  }
}
