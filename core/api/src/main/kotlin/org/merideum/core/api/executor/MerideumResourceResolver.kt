package org.merideum.core.api.executor

import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.ResourceResolver

class MerideumResourceResolver(
  private val resources: List<Resource<*>>
): ResourceResolver {
  override fun resolve(name: String): Resource<*>? {
    return resources.firstOrNull { it.name == name }
  }

  override fun resolve(name: String, path: String): Resource<*>? {
    return resources.firstOrNull { it.path == path && it.name == name }
  }
}
