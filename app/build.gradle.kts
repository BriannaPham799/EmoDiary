plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.emodiary"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.emodiary"
        minSdk = 28
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation("com.applandeo:material-calendar-view:1.9.2")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation(libs.navigation.ui)
    implementation(libs.firebase.firestore)
    implementation(libs.room.common)
    implementation(libs.room.runtime)
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.firebaseui:firebase-ui-firestore:8.0.0")
    implementation(libs.firebase.auth)
    implementation(libs.play.services.maps)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    annotationProcessor(libs.room.compiler)
}