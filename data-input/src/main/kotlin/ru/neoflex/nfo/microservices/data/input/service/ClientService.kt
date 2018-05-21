package ru.neoflex.nfo.microservices.data.input.service

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import ru.neoflex.nfo.microservices.data.input.model.Client

/**
 * @author mirzoevnik
 */
interface ClientService {

    fun findAll(): Flux<Client>
    fun save(client: Client): Mono<Client>
}