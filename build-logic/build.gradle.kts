plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(libs.androidGradle)
    implementation(libs.kotlinGradle)
}
