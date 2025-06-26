plugins {
    `maven-publish`
}

group = "citizens.library" // Your chosen group
version = "1.0.1"          // Your new version

publishing {
    publications {
        create<MavenPublication>("release") {
            artifact("maven/citizens/library/1.0.1/citizenslibrary-1.0.1.aar") {
                extension = "aar"
            }
        }
    }
    repositories {
        mavenLocal()
    }
}