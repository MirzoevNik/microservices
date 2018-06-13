package ru.neoflex.nfo.microservices.bpm.controller

import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.engine.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author mirzoevnik
 */
@RestController
class BusinessProcessController {

    @Autowired
    private lateinit var runtimeService: RuntimeService

    @Autowired
    private lateinit var taskService: TaskService

    @GetMapping("/start")
    fun startProcess(): String {
        return runtimeService.startProcessInstanceByKey("loan").id
    }

    @GetMapping("/user-task-complete")
    fun userTaskComplete(@RequestParam piid: String, @RequestParam appId: Long,
                         @RequestParam income: Double, @RequestParam familyStatus: String,
                         @RequestParam amount: Double, @RequestParam term: Int) {
        val params = mutableMapOf("appId" to appId, "income" to income,
                "familyStatus" to familyStatus, "amount" to amount, "term" to term)
        val task = taskService.createTaskQuery().processInstanceId(piid).singleResult()
        taskService.complete(task.id, params)
    }
}