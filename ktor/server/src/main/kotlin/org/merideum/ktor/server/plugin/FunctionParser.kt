package org.merideum.ktor.server.plugin

import org.merideum.core.interpreter.type.Type
import org.merideum.core.api.serializer.ObjectSerializer
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.KVisibility
import kotlin.reflect.full.declaredMemberFunctions

class FunctionParser(val serializers: Map<String, ObjectSerializer<*>>) {
  private val kotlinList = "kotlin.collections.List"
  private val kotlinInt = "kotlin.Int"
  private val kotlinString = "kotlin.String"

  private val kotlinListInt = "$kotlinList<$kotlinInt>"
  private val kotlinListString = "$kotlinList<$kotlinString>"

  fun functionsForInstance(instance: Any): Map<String, ResourceFunction> {
    // By default, assume all public functions are usable.
    val functions = instance::class.declaredMemberFunctions.filter { it.visibility == KVisibility.PUBLIC }
    val functionMap = mutableMapOf<String, ResourceFunction>()

    functions.forEach {
      val parameters = functionParameters(it.parameters)
      val returnType = getType(it.returnType.toString())

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
        FunctionParameter(getType(it.type.toString()), it)
      }
    }
  }

  private fun getType(type: String): FunctionType {
    return if (type == kotlinString) {
      FunctionType(Type.STRING, "String", null)
    } else if (type == kotlinInt) {
      FunctionType(Type.INT, "Int", null)
    } else if (type.startsWith(kotlinList)) {
      when (type) {
        kotlinListInt -> FunctionType(Type.LIST_INT, "List<Int>", Type.INT)
        kotlinListString -> FunctionType(Type.LIST_STRING, "List<String>", Type.STRING)
        else -> {
          val typeName = parseForListType(type)
          FunctionType(Type.LIST_OBJECT, typeName, Type.OBJECT, serializers[parseInnerType(typeName)])
        }
      }
    } else {
      FunctionType(Type.OBJECT, type, null, serializers[type])
    }
  }

  private fun buildMapKey(functionName: String, parameters: List<FunctionParameter>): String {
    return buildString {
      append(functionName)
      append("-")

      val parametersKey = parameters
        .filter { parameter -> parameter.type != null }
        .joinToString("-") { functionParameter -> functionParameter.type!!.type.declarationKey }

      append(parametersKey)
    }
  }

  private fun parseForListType(listType: String) = listType.replace("kotlin.collections.", "")
  private fun parseInnerType(listType: String) = listType.substring(listType.indexOf("<") + 1, listType.lastIndexOf(">"))
}

data class ResourceFunction(
  val name: String,
  val parameters: List<FunctionParameter>,
  val returnType: FunctionType,
  val function: KFunction<*>
)

data class FunctionType(
  val type: Type,
  val typeName: String,
  val innerType: Type? = null,
  val serializer: ObjectSerializer<*>? = null
)

data class FunctionParameter(
  val type: FunctionType?,
  val kParameter: KParameter
)
