plugins {
    kotlin("jvm").version("1.6.10")
    `maven-publish`
}

dependencies {

    // General
    implementation(project(":general"))

}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "net.gorayan.mc"
            artifactId = "paperin"
            version = "${findProperty("version")}"
        }
    }
}

allprojects {

    apply(plugin = "kotlin")

    repositories {

        mavenCentral()

        // Paper API
        maven { url = uri("https://papermc.io/repo/repository/maven-public/") }

    }

    dependencies {

        // Kotlin
        implementation(kotlin("stdlib"))

        // Test
        testImplementation(kotlin("test"))

        // Paper API
        compileOnly("io.papermc.paper:paper-api:${findProperty("paper-api-version")}")

    }

}
