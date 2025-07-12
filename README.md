## 📖 Documentation by Feature

- 🔗 [Authentication Features](docs/authentication/README.md)
- 🔗 [UI Components](docs/ui/README.md)
- 🔗 [Networking Tools](docs/networking/README.md)
- 🔗 [Database Utilities](docs/database/README.md)
- 🔗 [Animations & Transitions](docs/animations/README.md)
- 🔗 [Utilities](docs/utilities/README.md)

# CitizensLibrary 📦

A secure Android library delivered as a prebuilt `.aar`, hosted via [JitPack](https://jitpack.io).  
Simple to integrate — no source code is exposed.

---

## 📲 Installation Guide

### 1️⃣ Add JitPack to your `settings.gradle.kts`

```kotlin
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

2️⃣ Add the Library in your Module's build.gradle.kts

dependencies {
    implementation("com.github.rockstarshaurya:CitizensLibrary:1.0.4")
}

📦 Features

Prebuilt secure
Easy setup via Gradle

Hosted on GitHub + JitPack

🔄 Version History

✅ 1.0.4 – Current stable release
🔜 Future: 1.0.5 with improvements

🧑‍💻 Author

Made with ❤️ by rockstarshaurya

📜 License

This library is proprietary and source code is hidden.
You may use it in apps but not redistribute it.
