package org.merideum.ktor.server.executor

import org.merideum.kotlin.merit.interpreter.Resource

class InternalResource(
  override val name: String,
  override val path: String,
  val instance: Any
) : Resource
