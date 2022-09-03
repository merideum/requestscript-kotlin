plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
}

dependencies {
  val kotestVersion: String by project
  val ktorVersion: String by project
  val logbackVersion: String by project
  val kotlinSerializationJsonVersion: String by project
  val kotestKtorVersion: String by project

  api(project(":server:interpreter"))
  api(project(":server:api"))

  implementation("io.ktor:ktor-server-core:$ktorVersion")
  implementation("io.ktor:ktor-server-cio:$ktorVersion")
  implementation("ch.qos.logback:logback-classic:$logbackVersion")
  implementation("io.ktor:ktor-serialization:$ktorVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinSerializationJsonVersion")
  implementation("io.ktor:ktor-server-status-pages:$ktorVersion")

  implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")

  testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")

  testImplementation("io.ktor:ktor-serialization:$ktorVersion")
  testImplementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinSerializationJsonVersion")
  testImplementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
  testImplementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
  testImplementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
  testImplementation("io.ktor:ktor-server-test-host:$ktorVersion")
}
