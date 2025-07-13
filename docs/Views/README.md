
# 🧱 CitizensLibrary - `ContainerView`

A custom Android view based on `LinearLayout` that allows you to:
- 🟦 Apply **individual corner radii**
- 🎨 Set **background color**
- 🎯 Choose **different styling methods**
- ⚡ Add smooth **click animation**
- 📱 Customize entirely via XML — no code needed!

---

## 📦 Add the Library

### Step 1️⃣: Add JitPack in `settings.gradle.kts`

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
```

### Step 2️⃣: Add dependency in `build.gradle.kts`

```kotlin
dependencies {
    implementation("com.github.rockstarshaurya:CitizensLibrary:1.0.4")
}
```

---

## 🧩 How to Use in XML

```xml
<citizens.library.ContainerView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:padding="10dp"

    app:backgroundInt="@color/black"
    app:borderRadiusTopLeft="10"
    app:borderRadiusTopRight="50"
    app:borderRadiusBottomLeft="10"
    app:borderRadiusBottomRight="50"

    app:method="3"
    app:viewType="linear" />
```

---

## 🧠 About `app:method`

| Method | Description                                                                 |
|--------|-----------------------------------------------------------------------------|
| `0`    | Default layout. No background, no corner radius.                           |
| `1`    | Rounded corners on **all sides** using a default radius.                   |
| `2`    | Rounded corners with **custom border/stroke** and **background color**.    |
| `3`    | Fully custom: apply **each corner radius** and **background color**.       |

📌 Make sure to also use these attributes if using method `2` or `3`:
- `app:backgroundInt="@color/..."` → for inside color
- `app:borderRadiusTopLeft="..."`, etc.
- `app:borderColor="@color/..."` → for border (method 2)
- `app:borderWidth="2dp"` → for stroke width (method 2)

---

## ⚡ Optional: Add Click Animation in Kotlin

```kotlin
import citizens.library.ca

findViewById<ContainerView>(R.id.myContainer).ca {
    // Your action on click
}
```

The `.ca {}` extension adds a **smooth zoom-in click animation**.

---

## 🛠️ View Types

Set your layout type using `app:viewType`:

| Value    | Description         |
|----------|---------------------|
| `linear` | Acts as LinearLayout|
| `frame`  | Acts as FrameLayout |
| `relative` | (if supported)    |

---

## 👨‍💻 Author

Made by [@rockstarshaurya](https://github.com/rockstarshaurya)

---

## 🔐 License / Access

This library is released as a compiled `.aar`.  
🛡️ **Source code is not visible or included**.  
✅ Free to use in your apps.

