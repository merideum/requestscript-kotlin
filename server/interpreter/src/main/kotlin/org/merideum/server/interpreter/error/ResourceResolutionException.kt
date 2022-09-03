package org.merideum.server.interpreter.error

class ResourceResolutionException(resourceName: String): RuntimeException("Could not resolve resource: $resourceName")
