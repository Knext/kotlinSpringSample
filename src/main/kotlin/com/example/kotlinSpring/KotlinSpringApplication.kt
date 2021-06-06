package com.example.kotlinSpring

import com.example.kotlinSpring.config.BlogProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinSpringApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringApplication>(*args)
}
