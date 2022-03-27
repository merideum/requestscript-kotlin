plugins {
  kotlin("jvm")
}

dependencies {
  val merideumAntlr: String by project
  val antlr: String by project
  val kotestVersion: String by project

  implementation("org.merideum:antlr4:$merideumAntlr")

  testImplementation("org.antlr:antlr4-runtime:$antlr")

  testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}
