package org.merideum.kotlin.merit.interpreter.error

class DependencyResolutionException(dependencyName: String): RuntimeException("Could not resolve dependency: $dependencyName")
