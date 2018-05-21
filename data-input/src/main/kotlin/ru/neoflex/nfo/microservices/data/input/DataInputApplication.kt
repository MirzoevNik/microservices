package ru.neoflex.nfo.microservices.data.input

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author mirzoevnik
 */
@SpringBootApplication
class DataInputApplication

fun main(args: Array<String>) {
    SpringApplication.run(DataInputApplication::class.java, *args)
}