package ru.neoflex.nfo.microservices.data.input.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.neoflex.nfo.microservices.data.input.model.CreditApplication

/**
 * @author mirzoevnik
 */
@Repository
interface CreditApplicationRepository: JpaRepository<CreditApplication, Long>