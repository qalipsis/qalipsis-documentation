plugins {
    idea
    java
}

tasks.withType<Wrapper> {
    distributionType = Wrapper.DistributionType.BIN
    gradleVersion = "6.8.1"
}

allprojects {
    group = "io.qalipsis"
    version = File(rootDir, "project.version").readText().trim()

    apply(plugin = "java")

    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            name = "rubygems"
            setUrl("https://rubygems-proxy.torquebox.org/releases")
        }
    }

}
