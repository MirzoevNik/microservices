package ru.neoflex.nfo.microservices.make.decision.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.neoflex.nfo.microservices.make.decision.service.MakeDecisionService

/**
 * @author mirzoevnik
 */
@RestController
class MakeDecisionController {

    @Autowired
    private lateinit var makeDecisionService: MakeDecisionService

    @GetMapping
    fun makeDecision(@RequestParam income: Double, @RequestParam familyStatus: String,
                     @RequestParam amount: Double, @RequestParam term: Int): String {
        return makeDecisionService.makeDecision(income, familyStatus, amount, term)
    }
}