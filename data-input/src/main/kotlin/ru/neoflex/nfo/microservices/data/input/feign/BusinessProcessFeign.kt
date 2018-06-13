package ru.neoflex.nfo.microservices.data.input.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

/**
 * @author mirzoevnik
 */
@FeignClient("bpm")
@Service
interface BusinessProcessFeign {

    @RequestMapping(value = ["/start"], method = [RequestMethod.GET])
    fun startProcess(): String

    @RequestMapping(value = ["/user-task-complete"], method = [RequestMethod.GET])
    fun userTaskComplete(@RequestParam piid: String, @RequestParam appId: Long,
                         @RequestParam income: Double, @RequestParam familyStatus: String,
                         @RequestParam amount: Double, @RequestParam term: Int)
}