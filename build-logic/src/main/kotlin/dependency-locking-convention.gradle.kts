dependencyLocking {
    lockAllConfigurations()
}

tasks.register("resolveAndLockAll") {
    doFirst {
        require(gradle.startParameter.isWriteDependencyLocks) {
            "should be called with --write-locks flag"
        }
    }

    /**
     * Can't use "resolve" method, probably because of some project misconfiguration,
     * seems like dependencies will do the same
     *
     * see https://docs.gradle.org/current/userguide/dependency_locking.html#lock_all_configurations_in_one_build_execution
     */
    //    doLast {
    //        configurations.filter { it.isCanBeResolved }.forEach { it.resolve() }
    //    }
    dependsOn(tasks.named("dependencies"), tasks.named("buildEnvironment"))
}
