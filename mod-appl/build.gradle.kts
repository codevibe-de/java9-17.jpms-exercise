plugins {
    application
}

application {
    mainClass = "de.appl.MainApp"
}

dependencies {
    implementation(project(":mod-libA"))
}