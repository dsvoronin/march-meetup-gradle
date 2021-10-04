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

    resolutionStrategy {
        eachPlugin {
            val pluginId = requested.id.id

            if (pluginId.startsWith("org.jetbrains.kotlin")) {
                useVersion("1.4.30")
            } else if (pluginId.startsWith("com.android.")) {
                useModule("com.android.tools.build:gradle:4.1.2")
            }
        }
    }
}

dependencyResolutionManagement {

    repositories {
        google()
        mavenCentral()
    }
}
