package org.merideum.kotlin.merit.interpreter.type.serialization

import kotlin.reflect.KClass

annotation class SerializeObject<T : ObjectSerializer<*>>(
  val serializer: KClass<T>
)
