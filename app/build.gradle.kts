plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.deeplinksandbox"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.deeplinksandbox"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")

    // DeepLinkDispatch: runtime library + KSP annotation processor.
    implementation("com.airbnb:deeplinkdispatch:6.2.2")
    ksp("com.airbnb:deeplinkdispatch-processor:6.2.2")
}
