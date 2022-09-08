package org.merideum.core.interpreter.error

open class ScriptSyntaxException(
    override val message: String,
    val type: ScriptErrorType,
    val lineNumber: Int,
    val linePosition: Int
) : RuntimeException()
