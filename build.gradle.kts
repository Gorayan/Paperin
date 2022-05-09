plugins {
    kotlin("jvm").version("1.6.10")
}

repositories {

    mavenCentral()

    // Paper API
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }

}

dependencies {

    // Paper API
    compileOnly("io.papermc.paper:paper-api:${findProperty("paper-api-version")}")

}
