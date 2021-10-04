/**
 * Tests run from IDE in included builds can't recognize root wrapper
 * https://youtrack.jetbrains.com/issue/IDEA-262528
 */
tasks.withType<Wrapper>().configureEach {
    distributionType = Wrapper.DistributionType.BIN
    gradleVersion = "7.2"
}
