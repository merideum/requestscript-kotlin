package org.merideum.meriad.execution

interface MeriadRunner {
  /**
   * Executes the Meriad code and returns the [MeriadExecutionResult].
   *
   * @param code The Meriad code to run.
   */
  fun execute(code: String): MeriadExecutionResult
}
