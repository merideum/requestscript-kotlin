package org.merideum.core.interpreter.execution

import org.merideum.core.interpreter.ScriptContext

interface ScriptExecutor {
  /**
   * Executes the Merideum script code and returns the [ScriptExecutionResult].
   *
   * @param code The Merideum script code to run.
   */
  fun execute(code: String, context: ScriptContext): ScriptExecutionResult
}
