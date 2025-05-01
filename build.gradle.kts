// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

buildscript {
    repositories {
        google()  // Make sure this line is present
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")  // Your current Android Gradle plugin
        classpath("com.google.gms:google-services:4.3.15")  // Add this line for Firebase
    }
}
