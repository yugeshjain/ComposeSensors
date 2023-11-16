buildscript {
    val compose_version by extra("1.5.4")
    val wear_compose_version by extra("1.2.1")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("com.android.library") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.20" apply false
}
