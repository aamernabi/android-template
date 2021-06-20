apply plugin: "io.gitlab.arturbosch.detekt"

detekt {
    toolVersion = "$detekt_version"
    config = rootProject.files("config/detekt/detekt.yml")
    input = files("src/main/java")
    parallel = true
    reports {
        html {
            enabled = true
            destination = file("build/reports/detekt.html")
        }
    }
}

dependencies {
    detektPlugins  "io.gitlab.arturbosch.detekt:detekt-formatting:$detekt_version"
}
