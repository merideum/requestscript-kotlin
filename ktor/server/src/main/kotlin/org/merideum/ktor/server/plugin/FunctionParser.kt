package org.merideum.ktor.server.plugin

import org.merideum.kotlin.merit.interpreter.type.Type
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KVisibility
import kotlin.reflect.full.createType
import kotlin.reflect.full.declaredMemberFunctions

class FunctionParser {
  fun functionsForInstance(instance: Any): Map<String, ResourceFunction> {
    // By default, assume all public functions are usable.
    val functions = instance::class.declaredMemberFunctions.filter { it.visibility == KVisibility.PUBLIC }
    val functionMap = mutableMapOf<String, ResourceFunction>()

    functions.forEach {
      val parameters = functionParameters(it.parameters)
      val returnType = getType(it.returnType)

      val mapKey = buildMapKey(it.name, parameters)

      functionMap[mapKey] = ResourceFunction(it.name, parameters, returnType, it)
    }

    return functionMap.toMap()
  }

  private fun functionParameters(parameters: List<KParameter>): List<FunctionParameter> {
    return parameters.map {
      if (it.kind == KParameter.Kind.INSTANCE) {
        FunctionParameter(null, it)
      } else {
        FunctionParameter(getType(it.type), it)
      }
    }
  }

  private fun getType(returnType: KType): FunctionType {
    return when (returnType) {
      String::class.createType() -> {
        FunctionType(Type.STRING, "String")
      }
      Int::class.createType() -> {
        FunctionType(Type.INT, "Int")
      }
      else -> {
        FunctionType(Type.OBJECT, returnType.toString())
      }
    }
  }

  private fun buildMapKey(functionName: String, parameters: List<FunctionParameter>): String {
    return buildString {
      append(functionName)
      append("-")

      val parametersKey = parameters
        .filter { parameter -> parameter.type != null }
        .joinToString("-") { functionParameter -> functionParameter.type!!.type.typeName() }

      append(parametersKey)
    }
  }
}

data class ResourceFunction(
  val name: String,
  val parameters: List<FunctionParameter>,
  val returnType: FunctionType,
  val function: KFunction<*>
)

data class FunctionType(
  val type: Type,
  val typeName: String
)

data class FunctionParameter(
  val type: FunctionType?,
  val kParameter: KParameter
)
