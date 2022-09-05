plugins {
    `java`
}

dependencies {
    val antlr: String by project

    implementation("org.antlr:antlr4-runtime:$antlr")
}
