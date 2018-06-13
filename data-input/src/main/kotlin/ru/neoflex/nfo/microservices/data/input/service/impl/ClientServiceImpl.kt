package ru.neoflex.nfo.microservices.data.input.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.neoflex.nfo.microservices.data.input.model.Client
import ru.neoflex.nfo.microservices.data.input.repository.ClientRepository
import ru.neoflex.nfo.microservices.data.input.service.ClientService

/**
 * @author mirzoevnik
 */
@Service
class ClientServiceImpl: ClientService {

    @Autowired
    private lateinit var clientRepository: ClientRepository

    override fun findAll(): List<Client> {
        return clientRepository.findAll()
    }

    override fun save(client: Client): Client {
        return clientRepository.save(client)
    }
}