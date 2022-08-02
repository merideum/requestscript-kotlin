package org.merideum.ktor.server.executor.serialization

class MeritObject(private val mapping: MutableMap<String, Any?> = mutableMapOf()): MeritType, MutableMap<String, Any?> by mapping {

  private val structure: MutableMap<String, MeritType> = mutableMapOf()

  override fun put(key: String, value: Any?): Any? {

    val type = when (value) {
      is String -> StringType()
      is Int -> IntType()
      else ->
    }

    return mapping.put(key, value)
  }
}

interface MeritType
class StringType : MeritType
class IntType : MeritType
