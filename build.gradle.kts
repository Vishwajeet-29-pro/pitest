import org.gradle.api.tasks.wrapper.internal.DefaultWrapperVersionsResources.LATEST

plugins {
    id("java")
    id("info.solidsoft.pitest") version "1.15.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/info.solidsoft.gradle.pitest/gradle-pitest-plugin
    implementation("info.solidsoft.gradle.pitest:gradle-pitest-plugin:1.15.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.3")
    testImplementation("io.cucumber:cucumber-java:7.0.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.0.0")
    testImplementation("org.mockito:mockito-core:4.3.1")
    testImplementation("org.junit.platform:junit-platform-launcher:1.10.3")
    testImplementation("org.junit.platform:junit-platform-commons:1.10.3")
    testImplementation("org.junit.platform:junit-platform-engine:1.10.3")
    testImplementation("org.junit.platform:junit-platform-suite-api:1.10.3")

    // PIT JUnit 5 plugin
    testImplementation("org.pitest:pitest-junit5-plugin:0.15")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "21"
    targetCompatibility = "21"
    options.encoding = "UTF-8"
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("cucumber", "junit-jupiter")
    }
    testLogging {
        events("passed", "failed", "skipped")
    }
}

// PIT Mutation Testing Configuration
pitest {
    targetClasses.set(listOf("org.example.*"))
    targetTests.set(listOf("org.example.*"))
    verbose.set(true)
    mutators.set(listOf("DEFAULTS"))
    threads.set(4)
    outputFormats.set(listOf("HTML", "XML"))
}
