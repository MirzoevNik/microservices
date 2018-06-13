package ru.neoflex.nfo.microservices.bpm.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * @author mirzoevnik
 */
@FeignClient("data-input")
@RequestMapping("/applications")
@Service
interface CreditApplicationFeign {
    @GetMapping("/update-status/{id}/{status}")
    fun updateStatus(@RequestParam id: Long, @RequestParam status: String)
}