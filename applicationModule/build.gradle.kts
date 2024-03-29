plugins {
    id("android-application-convention")
    id("dependency-locking-convention")
}

android {
    defaultConfig {
        applicationId = "com.applicationModule"
    }
    dataBinding {
        isEnabled = true
    }
}

dependencies {
    api(project(":libraryModule2"))
    api(project(":libraryModule1"))
    implementation(project(":pureModule"))
    testImplementation(libs.junit4)
}
