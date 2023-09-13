package tech.codehype.learn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(MyProperties::class)
class LearnApplication

fun main(args: Array<String>) {
	runApplication<LearnApplication>(*args)
}



@ConfigurationProperties("my.app")
data class MyProperties(var header: String, var body: String)
