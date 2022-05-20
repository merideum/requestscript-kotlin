package org.merideum.kotlin.merit.interpreter

interface DependencyResolver {
  fun resolve(name: String): Dependency?
  fun resolve(name: String, path: String): Dependency?
}
