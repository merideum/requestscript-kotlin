package org.merideum.ktor.server.plugin

import org.merideum.kotlin.merit.interpreter.type.*
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KVisibility
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

  private fun getType(type: KType): Type {
    return when (type.classifier) {
      String::class -> {
        StringType()
      }
      Int::class -> {
        IntType()
      }
      List::class -> {
        getListType(type)
      }
      else -> {
        ObjectType(type.toString())
      }
    }
  }

  private fun getListType(type: KType): Type {
    val innerType = getType(type.arguments.single().type!!)
    return ListType(innerType)
  }

  private fun buildMapKey(functionName: String, parameters: List<FunctionParameter>): String {
    return buildString {
      append(functionName)
      append("-")

      val parametersKey = parameters
        .filter { parameter -> parameter.type != null }
        .joinToString("-") { functionParameter -> functionParameter.type!!.qualifiedTypeName() }

      append(parametersKey)
    }
  }
}

data class ResourceFunction(
  val name: String,
  val parameters: List<FunctionParameter>,
  val returnType: Type,
  val function: KFunction<*>
)

data class FunctionParameter(
  val type: Type?,
  val kParameter: KParameter
)
