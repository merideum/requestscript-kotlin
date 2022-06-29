package org.merideum.kotlin.merit.interpreter.error

class ResourceResolutionException(resourceName: String): RuntimeException("Could not resolve resource: $resourceName")
