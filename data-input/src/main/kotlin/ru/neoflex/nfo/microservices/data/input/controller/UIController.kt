package ru.neoflex.nfo.microservices.data.input.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import ru.neoflex.nfo.microservices.data.input.feign.BusinessProcessFeign
import ru.neoflex.nfo.microservices.data.input.model.CreditApplication
import ru.neoflex.nfo.microservices.data.input.service.CreditApplicationService
import java.util.*

/**
 * @author mirzoevnik
 */
@Controller
class UIController {

    @Autowired
    private lateinit var creditApplicationService: CreditApplicationService

    @Autowired
    private lateinit var businessProcessFeign: BusinessProcessFeign

    @PostMapping("/app/{piid}")
    fun save(@ModelAttribute creditApplication: CreditApplication, @PathVariable piid: String): String {
        creditApplication.piid = piid
        val app = creditApplicationService.save(creditApplication)
        businessProcessFeign.userTaskComplete(piid, app.id!!, app.client!!.income!!,
                app.client!!.familyStatus!!, app.amount!!, app.term!!)
        return "redirect:/data-input/home"
    }

    @GetMapping("/app/start")
    fun start(model: Model): String {
        model.addAttribute("piid", businessProcessFeign.startProcess())
        model.addAttribute("app", CreditApplication(startDate = Date()))
        return "app"
    }

    @GetMapping("/home")
    fun home(model: Model): String {
        model.addAttribute("apps", creditApplicationService.findAll())
        return "home"
    }
}