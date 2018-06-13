package ru.neoflex.nfo.microservices.data.input.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.neoflex.nfo.microservices.data.input.model.Client
import ru.neoflex.nfo.microservices.data.input.service.ClientService

/**
 * @author mirzoevnik
 */
@RestController
@RequestMapping("/clients")
class ClientController {

    @Autowired
    private lateinit var clientService: ClientService

    @PostMapping
    fun post(@RequestBody client: Client): Client {
        return clientService.save(client)
    }

    @GetMapping
    fun get(): List<Client> {
        return clientService.findAll()
    }
}