plugins {
    `maven-publish`
}

group = "citizens.library"
version = "1.0.2"

// ⬇️ This fakes the 'assemble' task so JitPack doesn't fail
tasks.register("assemble") {
    doLast {
        println("No real assemble needed. This is a prebuilt AAR.")
    }
}

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
