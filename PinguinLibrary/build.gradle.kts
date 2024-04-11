plugins {
    id("java")
}

group = "co.com.sofka"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")// https://mvnrepository.com/artifact/mysql/mysql-connector-java
    implementation("mysql:mysql-connector-java:8.0.28")

}

tasks.test {
    useJUnitPlatform()
}