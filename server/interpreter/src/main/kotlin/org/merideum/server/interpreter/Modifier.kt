package org.merideum.server.interpreter

enum class Modifier(val keyword: String) {
  CONST("const"),
  VAR("var");

  companion object {
    fun fromKeyword(keyword: String) = values().single { it.keyword == keyword }
  }
}

fun String.toModifier() = Modifier.fromKeyword(this)
