plugins {
    id("com.gradle.build-scan") version "1.15.2"
    id("org.gradle.guides.getting-started") version "0.15.1"
    id("org.gradle.guides.test-jvm-code") version "0.15.1"
}

configure<org.gradle.guides.GuidesExtension> {
    repoPath = "gradle-guides/building-kotlin-jvm-libraries"
}

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
    if (!System.getenv("CI").isNullOrEmpty()) {
        publishAlways()
        tag("CI")
    }
}
