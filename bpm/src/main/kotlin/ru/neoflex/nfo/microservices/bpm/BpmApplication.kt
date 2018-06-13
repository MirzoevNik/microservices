package ru.neoflex.nfo.microservices.bpm

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

/**
 * @author mirzoevnik
 */
@EnableProcessApplication
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
class BpmApplication

fun main(args: Array<String>) {
    SpringApplication.run(BpmApplication::class.java, *args)
}