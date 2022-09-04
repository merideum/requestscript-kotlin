package org.merideum.core.interpreter.error

class ResourceResolutionException(resourceName: String): RuntimeException("Could not resolve resource: $resourceName")
