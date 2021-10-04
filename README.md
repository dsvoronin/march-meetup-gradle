Faced a problem with [dependency locking mechanism](https://docs.gradle.org/current/userguide/dependency_locking.html):

Project is a multimodule android app where only app module is locked.

I upgraded transitive rxjava dependency, see `libs.version.toml`.

## Expected Result

Build will fail because `io.reactivex.rxjava3:rxjava` is locked to `3.0.13` in `*runtimeClasspath`, see `applicationModule/gradle.lockfile`
And new version (`3.1.1`) is declared in `libraryModule1` through version catalog

## Actual result

build finished correctly, locked version wins

Important!!: calling `./gradlew resolveAndLockAll --write-locks` will actually rewrite version to the new one

## Why it's undesirable behavior for me?

- I wanted to lock versions for an app only (i have ~500 modules in real project and it's a mess to lock all of them)
- I don't want to directly add every transitive library to an app, i don't know how to correctly maintain that

## What i want?

Probably a mode for dependency lock that dependency resolution will go in two phases:
 - resolve `applicationModule` without locking to see that rxJava is actually resolved in `3.1.1`
 - fail on comparison with locking `3.0.13` 

What are my options to solve this?

## Related discussion

https://gradle-community.slack.com/archives/CAH4ZP3GX/p1632215556061900
