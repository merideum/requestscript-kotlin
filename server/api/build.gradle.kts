plugins {
  kotlin("jvm")
}

dependencies {
  val kotestVersion: String by project

  api(project(":server:interpreter"))

  implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")

  testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}
