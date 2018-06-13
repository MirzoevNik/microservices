package ru.neoflex.nfo.microservices.bpm.tasks

import org.camunda.bpm.engine.TaskService
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.neoflex.nfo.microservices.bpm.feign.CreditApplicationFeign
import ru.neoflex.nfo.microservices.bpm.feign.MakeDecisionFeign

/**
 * @author mirzoevnik
 */
@Service
class MakeDecisionTask: JavaDelegate {

    @Autowired
    private lateinit var creditApplicationFeign: CreditApplicationFeign

    @Autowired
    private lateinit var makeDecisionFeign: MakeDecisionFeign

    @Autowired
    private lateinit var taskService: TaskService

    override fun execute(execution: DelegateExecution?) {
        val task = taskService.createTaskQuery().processInstanceId(execution!!.processInstanceId).singleResult()
        val params = taskService.getVariables(task.id)
        val status = makeDecisionFeign.makeDecision(params["income"] as Double,
                params["familyStatus"] as String, params["amount"] as Double,
                params["term"] as Int)
        creditApplicationFeign.updateStatus(params["appId"] as Long, status)
    }
}