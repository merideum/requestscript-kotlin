plugins {
    `java`

    `maven-publish`
}

dependencies {
    val antlr: String by project

    implementation("org.antlr:antlr4-runtime:$antlr")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.requestscript.core"
            artifactId = "antlr"
            version = "0.0.1"

            from(components["java"])
        }
    }
}
