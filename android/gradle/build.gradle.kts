plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.mytensorflowapplication"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mytensorflowapplication"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    // AndroidX Core & Lifecycle
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Jetpack Compose BOM (Manages Compose dependency versions)
    implementation(platform(libs.androidx.compose.bom))

    // Jetpack Compose UI Components
    implementation(libs.androidx.compose.ui.ui)
    implementation(libs.androidx.compose.ui.ui.tooling.preview)
    implementation(libs.androidx.activity.compose)

    // Material Theme (Fixes 'MaterialTheme' and 'Surface' issues)
    implementation(libs.androidx.material) // Material 2
    implementation(libs.material3) // Material 3

    // Jetpack Compose UI Debugging Tools
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    // TensorFlow Lite (Ensure correct dependency version)
    implementation("org.tensorflow:tensorflow-lite:2.9.0")
    //{
       // exclude(group = "org.tensorflow", module = "tensorflow-lite-api")
  //  }

    // Testing Libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
}

