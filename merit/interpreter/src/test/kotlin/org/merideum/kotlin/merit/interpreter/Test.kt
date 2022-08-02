package org.merideum.kotlin.merit.interpreter

import io.kotest.core.spec.style.DescribeSpec
import org.merideum.kotlin.merit.interpreter.type.value.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.value.StringValue
import org.merideum.kotlin.merit.interpreter.type.value.TypedValue
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.KProperty1
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.full.valueParameters

class Test: DescribeSpec({
  it("do thing") {
    val asdf = MeritObject()
    asdf["one"] = "asdf"

    println(asdf.field)
  }
})


