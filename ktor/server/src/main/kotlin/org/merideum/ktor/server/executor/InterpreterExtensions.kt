package org.merideum.ktor.server.executor

import org.merideum.kotlin.merit.interpreter.Modifier
import org.merideum.kotlin.merit.interpreter.VariableScope

fun VariableScope.addRequest(request: Request) {
  this.declareAndAssignVariable("request", request, Modifier.CONST)
}
