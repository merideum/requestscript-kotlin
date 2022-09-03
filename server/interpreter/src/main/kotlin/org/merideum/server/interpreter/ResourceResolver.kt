package org.merideum.server.interpreter

interface ResourceResolver {
  fun resolve(name: String): Resource<*>?
  fun resolve(name: String, path: String): Resource<*>?
}
