package ru.neoflex.nfo.microservices.bpm.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * @author mirzoevnik
 */
@FeignClient("make-decision")
@Service
interface MakeDecisionFeign {

    @GetMapping
    fun makeDecision(@RequestParam income: Double, @RequestParam familyStatus: String,
                     @RequestParam amount: Double, @RequestParam term: Int): String
}