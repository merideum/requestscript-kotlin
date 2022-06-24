package org.merideum.ktor.server.resources

class Greeter {
  fun happyBirthday(age: Int): String {
    val ageModTen = age % 10
    val ageModHundred = age % 100

    val suffix = when {
      ageModTen == 1 && ageModHundred != 11 -> "st"
      ageModTen == 2 && ageModHundred != 12 -> "nd"
      ageModTen == 3 && ageModHundred != 13 -> "rd"
        else -> "th"
    }

    return "Happy $age$suffix birthday!"
  }
}
