package ru.neoflex.nfo.microservices.data.input.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.neoflex.nfo.microservices.data.input.model.Client

/**
 * @author mirzoevnik
 */
@Repository
interface ClientRepository: JpaRepository<Client, Long>