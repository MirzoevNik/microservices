package ru.neoflex.nfo.microservices.data.input.repository

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import ru.neoflex.nfo.microservices.data.input.model.Client

/**
 * @author mirzoevnik
 */
interface ClientRepository: ReactiveMongoRepository<Client, String>