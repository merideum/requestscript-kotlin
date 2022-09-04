package org.merideum.server.interpreter.execution

import org.merideum.server.interpreter.ScriptContext

interface ScriptExecutor {
  /**
   * Executes the Merideum script code and returns the [ScriptExecutionResult].
   *
   * @param code The Merideum script code to run.
   */
  fun execute(code: String, context: ScriptContext): ScriptExecutionResult
}
