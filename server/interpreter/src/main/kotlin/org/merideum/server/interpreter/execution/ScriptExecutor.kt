package org.merideum.server.execution

import org.merideum.server.interpreter.ScriptContext

interface ScriptExecutor {
  /**
   * Executes the Merit code and returns the [ScriptExecutionResult].
   *
   * @param code The Merit code to run.
   */
  fun execute(code: String, context: ScriptContext): org.merideum.server.execution.ScriptExecutionResult
}
