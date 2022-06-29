package org.merideum.kotlin.merit.interpreter


interface VariableValue <T> {

  val value: T?

  fun callFunction(functionName: String, parameters: List<*>): Any?

  fun get(): T?
}
