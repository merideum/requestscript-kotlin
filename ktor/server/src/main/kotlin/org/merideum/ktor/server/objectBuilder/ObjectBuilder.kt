package org.merideum.ktor.server.objectBuilder

//import org.merideum.kotlin.merit.interpreter.visitors.ExpressionVisitor
//
//class ObjectBuilder {
//  val fields = mutableListOf<ExpressionVisitor.ObjectField>()
//
//  fun field(init: ExpressionVisitor.ObjectField.() -> Unit) {
//    val field = ExpressionVisitor.ObjectField()
//
//    field.init()
//    fields.add(field)
//  }
//}
//
//abstract class Field {
//  fun <T: Field> initField(field: T, init: T.() -> Unit): T {
//    field.init()
//
//    return field
//  }
//}
//
//class ObjectField : Field()
//
//
//fun objectBuilder(init: ObjectBuilder.() -> Unit): ObjectBuilder {
//  val theObject = ObjectBuilder()
//  theObject.init()
//  return theObject
//}
