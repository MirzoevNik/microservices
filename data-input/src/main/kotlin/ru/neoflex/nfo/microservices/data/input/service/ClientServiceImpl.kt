package ru.neoflex.nfo.microservices.data.input.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import ru.neoflex.nfo.microservices.data.input.model.Client
import ru.neoflex.nfo.microservices.data.input.repository.ClientRepository

/**
 * @author mirzoevnik
 */
@Service
class ClientServiceImpl: ClientService {

    @Autowired
    private lateinit var clientRepository: ClientRepository

    override fun findAll(): Flux<Client> {
        return clientRepository.findAll()
    }

    override fun save(client: Client): Mono<Client> {
        return clientRepository.save(client)
    }
}