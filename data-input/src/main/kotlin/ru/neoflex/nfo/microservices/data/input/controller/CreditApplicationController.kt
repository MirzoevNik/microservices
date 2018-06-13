package ru.neoflex.nfo.microservices.data.input.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.neoflex.nfo.microservices.data.input.model.CreditApplication
import ru.neoflex.nfo.microservices.data.input.service.CreditApplicationService

/**
 * @author mirzoevnik
 */
@RestController
@RequestMapping("/applications")
class CreditApplicationController {

    @Autowired
    private lateinit var creditApplicationService: CreditApplicationService

    @PostMapping
    fun post(@RequestBody creditApplication: CreditApplication): CreditApplication {
        return creditApplicationService.save(creditApplication)
    }

    @GetMapping
    fun get(): List<CreditApplication> {
        return creditApplicationService.findAll()
    }

    @GetMapping("/update-status/{id}/{status}")
    fun updateStatus(@RequestParam id: Long, @RequestParam status: String) {
        val application = creditApplicationService.getById(id)
        application.status = status
        creditApplicationService.save(application)
    }
}