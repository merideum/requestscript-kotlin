package org.merideum.ktor.server.executor

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.type.*
import org.merideum.kotlin.merit.interpreter.type.value.*
import org.merideum.ktor.server.plugin.ResourceFunction

@Suppress("UNCHECKED_CAST")
class InternalResource<T>(
  override val name: String,
  override val path: String,
  override val value: T,
  private val functions: Map<String, ResourceFunction>
) : Resource<T>() {

  override fun get(): T? {
    throw Exception("Cannot get a Resource.")
  }
  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): TypedValue<*> {
    val serializerResolver = context.getOrThrow<SerializerResolver>("serializerResolver")

    val mapKey = buildMapKey(functionName, parameters)

    val foundFunction = functions[mapKey]

    if (foundFunction != null) {
      val kotlinParameters = foundFunction.parameters.map {
        it.kParameter
      }

      /**
       * Associate the parameters passed by the caller with the parameters of the function.
       */
      val functionParameters = kotlinParameters.zip(listOf(value) + parameters) { kParameter, parameter ->
          val parameterValue = if (parameter is TypedValue<*>) {

            val parameterValue = parameter.get()

            // TODO don't check for a serializer if the expected parameter is a Map (or assume a serializer does not exist for a map?)
            if (parameter.type.value == TypeOption.OBJECT && parameterValue is Map<*, *>) {
              val parameterSerializer = serializerResolver.resolveOrThrow(parameterValue, kParameter.type.toString())

              parameterSerializer.deserialize(parameterValue as Map<String, Any?>)
            }
            else {
              parameterValue
            }
          } else {
            parameter
          }

          kParameter to parameterValue
        }
      .toMap()

      val functionCallResult = foundFunction.function.callBy(functionParameters)

      /**
       * if string
       */

//      if (foundFunction.returnType.value == TypeOption.OBJECT) {
//        val returnSerializer = serializerResolver.resolveOrThrow(functionCallResult, foundFunction.returnType.kTypeName)
//
//        ObjectValue(returnSerializer.serialize(functionCallResult).toMutableMap())
//      }

//      return when (val result = foundFunction.function.callBy(functionParameters)) {
//
//        is Int -> {
//          IntValue(result)
//        }
//        is String -> {
//          StringValue(result)
//        }
//        is List<*> -> {
//          ListValue.fromKotlinList(result)
//        }
//        else -> {
//          val returnSerializer = serializerResolver.resolveOrThrow(result, foundFunction.returnType.kTypeName)
//
//          ObjectValue(returnSerializer.serialize(result).toMutableMap())
//        }
//      }
    }

    // TODO throw better exception
    throw RuntimeException("Could not find function '$functionName'")
  }

  private fun buildMapKey(functionName: String, parameters: List<TypedValue<*>>): String {
    return buildString {
      append(functionName)
      append("-")

      val parametersKey = parameters
        .map { it.type }
        .joinToString("-") { it.value.typeName() }

      append(parametersKey)
    }
  }

}
