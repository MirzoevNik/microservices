package ru.neoflex.nfo.microservices.make.decision

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * @author mirzoevnik
 */
@SpringBootApplication
@EnableEurekaClient
class MakeDecisionApplication

fun main(args: Array<String>) {
    SpringApplication.run(MakeDecisionApplication::class.java, *args)
}