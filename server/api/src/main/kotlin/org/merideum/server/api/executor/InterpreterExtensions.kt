package org.merideum.server.api.executor

import org.merideum.server.interpreter.Modifier
import org.merideum.server.interpreter.VariableScope

fun VariableScope.addRequest(request: Request) {
  this.declareAndAssignVariable("request", request, Modifier.CONST)
}
