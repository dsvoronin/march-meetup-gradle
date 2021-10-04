enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "genny"

includeBuild("build-logic")

include("applicationModule")
include("libraryModule1")
include("libraryModule2")
include("pureModule2")
include("pureModule")

pluginManagement {

    repositories {
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {

    repositories {
        google()
        mavenCentral()
    }
}
