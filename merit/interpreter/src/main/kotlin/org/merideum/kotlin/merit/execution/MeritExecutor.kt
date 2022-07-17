package org.merideum.kotlin.merit.execution

import org.merideum.kotlin.merit.ScriptContext

interface MeritExecutor {
  /**
   * Executes the Merit code and returns the [MeritExecutionResult].
   *
   * @param code The Merit code to run.
   */
  fun execute(code: String, context: ScriptContext): MeritExecutionResult
}
