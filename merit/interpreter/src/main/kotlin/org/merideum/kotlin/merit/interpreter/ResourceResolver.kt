package org.merideum.kotlin.merit.interpreter

interface ResourceResolver {
  fun resolve(name: String): Resource<*>?
  fun resolve(name: String, path: String): Resource<*>?
}
