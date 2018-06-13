package ru.neoflex.nfo.microservices.data.input.service

import ru.neoflex.nfo.microservices.data.input.model.Client

/**
 * @author mirzoevnik
 */
interface ClientService {

    fun findAll(): List<Client>
    fun save(client: Client): Client
}