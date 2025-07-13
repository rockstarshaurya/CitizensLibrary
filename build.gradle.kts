plugins {
    `maven-publish`
}

group = "citizens.library"
version = "1.0.6"

tasks.register("assemble") {
    doLast {
        println("No real assemble needed. This is a prebuilt AAR.")
    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.rockstarshaurya"
            artifactId = "CitizensLibrary"
            version = "1.0.6"

            artifact("maven/citizens/library/1.0.6/citizenslibrary-1.0.6.aar")
        }
    }
    repositories {
        mavenLocal()
    }
}
