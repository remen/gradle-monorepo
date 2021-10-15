/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("monorepo.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("monorepo.app.AppKt")
}
