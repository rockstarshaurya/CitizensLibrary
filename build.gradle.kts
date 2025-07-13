plugins {
    `maven-publish`
}

group = "citizens.library"
version = "1.0.10"

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
            version = "1.0.10"

            artifact("maven/citizens/library/1.0.10/citizenslibrary-1.0.10.aar")
        }
    }
    repositories {
        mavenLocal()
    }
}
