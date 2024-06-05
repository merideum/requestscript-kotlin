plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")

    `maven-publish`
}

dependencies {
    val antlr: String by project
    val kotestVersion: String by project
    val mockkVersion: String by project

    api(project(":core:antlr"))

    api("org.antlr:antlr4-runtime:$antlr")

    testImplementation("org.antlr:antlr4-runtime:$antlr")

    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")

    testImplementation("io.mockk:mockk:$mockkVersion")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.requestscript.core"
            artifactId = "interpreter"
            version = "0.0.1"

            from(components["java"])
        }
    }
}
