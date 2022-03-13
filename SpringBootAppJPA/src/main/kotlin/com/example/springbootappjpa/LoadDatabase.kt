package com.example.springbootappjpa

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
internal class LoadDatabase {
    @Bean
    fun initDatabase(repository: EmployeeRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            log.info(
                "Preloading " + repository.save(
                    Employee(
                        "Bilbo Baggins",
                        "burglar"
                    )
                )
            )
            log.info(
                "Preloading " + repository.save(
                    Employee(
                        "Frodo Baggins",
                        "thief"
                    )
                )
            )
            log.info(
                "Preloading " + repository.save(
                    Employee(
                        "Gandalf",
                        "Wizard"
                    )
                )
            )
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(LoadDatabase::class.java)
    }
}