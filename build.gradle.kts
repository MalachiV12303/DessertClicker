buildscript {
    ext {
        compose_compiler_version = '1.4.0'
        lifecycle_version = "2.5.1"
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id 'com.android.application' version '7.4.1' apply false
    id 'com.android.library' version '7.4.1' apply false
    id 'org.jetbrains.kotlin.android' version '1.8.0' apply false
}

task clean(type: Delete) {
    delete rootProject.buildDir
}