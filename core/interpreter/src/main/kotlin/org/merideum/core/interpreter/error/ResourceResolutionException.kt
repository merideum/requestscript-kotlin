package org.merideum.core.interpreter.error

class ResourceResolutionException(resourceName: String): ScriptRuntimeException("Could not resolve resource: $resourceName")
