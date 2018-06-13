package ru.neoflex.nfo.microservices.data.input

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

/**
 * @author mirzoevnik
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
class DataInputApplication

fun main(args: Array<String>) {
    SpringApplication.run(DataInputApplication::class.java, *args)
}