package com.example.mobile.number

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MobileNumberApplication{

	private val log = LoggerFactory.getLogger(MobileNumberApplication::class.java)

	@Bean
	fun init(repo)
}



fun main(args: Array<String>) {
	runApplication<MobileNumberApplication>(*args)
}
