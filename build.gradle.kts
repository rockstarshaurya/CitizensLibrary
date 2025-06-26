plugins {
    `maven-publish`
}

group = "citizens.library"
version = "1.0.3"

tasks.register("assemble") {
    doLast {
        println("No real assemble needed. This is a prebuilt AAR.")
    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
            artifact("maven/citizens/library/1.0.2/citizenslibrary-1.0.3.aar") {
                extension = "aar"
            }
        }
    }
    repositories {
        mavenLocal()
    }
}
