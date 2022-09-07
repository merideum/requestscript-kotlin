package org.merideum.core.interpreter.error

open class ScriptSyntaxException(override val message: String, val type: ScriptErrorType) : RuntimeException()
