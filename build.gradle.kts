plugins {
    `maven-publish`
}

group = "citizens.library"
version = "1.0.0"

publishing {
    publications {
        create<MavenPublication>("release") {
            artifact("maven/citizens/library/1.0.0/citizenslibrary-1.0.0.aar") {
                extension = "aar"
            }
        }
    }
    repositories {
        mavenLocal()
    }
}
