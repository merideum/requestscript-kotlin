plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")

    `maven-publish`
}

dependencies {
    val kotestVersion: String by project

    api(project(":core:interpreter"))

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")

    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.requestscript.core"
            artifactId = "api"
            version = "0.0.1"

            from(components["java"])
        }
    }
}
