package ru.neoflex.nfo.microservices.data.input.service

import ru.neoflex.nfo.microservices.data.input.model.CreditApplication

/**
 * @author mirzoevnik
 */
interface CreditApplicationService {

    fun findAll(): List<CreditApplication>
    fun save(creditApplication: CreditApplication): CreditApplication
    fun getById(id: Long) : CreditApplication
}