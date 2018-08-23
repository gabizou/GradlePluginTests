import org.spongepowered.gradle.sort.SortClassGroup
import org.spongepowered.gradle.sort.SortFieldsExtension

buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("org.spongepowered:sponge-gradle-plugin:0.9.0-SNAPSHOT")
    }
}
apply(plugin = "sponge-gradle-plugin")

group = properties["pluginGroup"]!!
version = properties["pluginVersion"]!!

dependencies {
    "compile"("org.spongepowered:spongeapi:7.0.0")
}

configure<SortFieldsExtension> {

}
//
//sponge.plugin.id = properties["pluginId"] as String
