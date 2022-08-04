package org.merideum.ktor.server.executor

import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.Resource
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.Type
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.ktor.server.plugin.ResourceFunction

@Suppress("UNCHECKED_CAST")
class InternalResource<T>(
  override val name: String,
  override val path: String,
  override val value: T,
  private val functions: Map<String, ResourceFunction>
) : Resource<T> {

  override fun get(): T? {
    throw Exception("Cannot get a Resource.")
  }

  override fun getValue(): TypedValue<*> {
    throw RuntimeException("Cannot get value of internal resource")
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
            if (parameter.type == Type.OBJECT) {
              val parameterSerializer = serializerResolver.resolveOrThrow(kParameter.type.toString())

              parameterSerializer.deserialize(parameterValue as Map<String, TypedValue<*>>)
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

      return when (val result = foundFunction.function.callBy(functionParameters)) {
        is Int -> {
          IntValue(result)
        }
        is String -> {
          StringValue(result)
        }
        else -> {
          val returnSerializer = serializerResolver.resolveOrThrow(result, foundFunction.returnType.typeName)

          returnSerializer.serialize(result).getObjectValue()
        }
      }
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
        .joinToString("-") { it.typeName() }

      append(parametersKey)
    }
  }
}
