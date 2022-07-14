package org.merideum.kotlin.merit.interpreter.visitors

import org.merideum.kotlin.merit.interpreter.MeritValue
import org.merideum.kotlin.merit.interpreter.Variable
import org.merideum.kotlin.merit.interpreter.error.TypeMismatchedException
import org.merideum.kotlin.merit.interpreter.error.UnknownVariableIdentifierException
import org.merideum.kotlin.merit.interpreter.toModifier
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.kotlin.merit.interpreter.type.TypedValue
import org.merideum.merit.antlr.MeritParser
import org.merideum.merit.antlr.MeritParserBaseVisitor

class ExpressionVisitor(
  private val parent: ScriptVisitor
): MeritParserBaseVisitor<MeritValue<*>>() {

  override fun visitIntegerExpression(ctx: MeritParser.IntegerExpressionContext): MeritValue<IntValue> {
    return MeritValue(IntValue(ctx.text.toInt()))
  }

  override fun visitStringExpression(ctx: MeritParser.StringExpressionContext): MeritValue<StringValue> {
    val content = ctx.stringContent().joinToString("") {
      // TODO throw better exception
      when (val stringPart = parent.visit(it).value) {
        is Variable<*> -> {
          stringPart.value?.stringify() ?: throw RuntimeException("Could not stringify null value")
        }
        is TypedValue<*> -> {
          stringPart.stringify()
        }
        is String -> {
          stringPart
        }
        else -> throw RuntimeException("Could not stringify content")
      }
    }

    return MeritValue(StringValue(content))
  }

  /**
   * Merit code that has been embedded into a string.
   *
   * Example:
   * const name = "World"
   * const greeting = "Hello ${name}!"
   */
  override fun visitEmbeddedExpression(ctx: MeritParser.EmbeddedExpressionContext): MeritValue<*> {
    return MeritValue(parent.visit(ctx.expression()).value)
  }

  override fun visitSimpleIdentifierExpression(ctx: MeritParser.SimpleIdentifierExpressionContext): MeritValue<Variable<*>> {
    val expectedIdentifier = ctx.simpleIdentifier().text

    val found = parent.scope.resolveVariable(expectedIdentifier)
      ?: throw UnknownVariableIdentifierException(expectedIdentifier)

    return MeritValue(found)
  }
}
