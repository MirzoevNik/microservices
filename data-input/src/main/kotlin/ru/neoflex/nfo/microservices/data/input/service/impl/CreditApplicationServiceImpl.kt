package ru.neoflex.nfo.microservices.data.input.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.neoflex.nfo.microservices.data.input.model.CreditApplication
import ru.neoflex.nfo.microservices.data.input.repository.CreditApplicationRepository
import ru.neoflex.nfo.microservices.data.input.service.CreditApplicationService

/**
 * @author mirzoevnik
 */
@Service
class CreditApplicationServiceImpl : CreditApplicationService {

    @Autowired
    private lateinit var creditApplicationRepository: CreditApplicationRepository

    override fun findAll(): List<CreditApplication> {
        return creditApplicationRepository.findAll()
    }

    override fun save(creditApplication: CreditApplication): CreditApplication {
        return creditApplicationRepository.save(creditApplication)
    }

    override fun getById(id: Long): CreditApplication {
        return creditApplicationRepository.getOne(id)
    }
}