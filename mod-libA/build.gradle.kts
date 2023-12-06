plugins {
    id("java-library")  // allows api() below
}

dependencies {
    api(project(":mod-libB")) // api = transitive dependencies
}