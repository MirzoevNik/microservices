package ru.neoflex.nfo.microservices.make.decision.service

import org.springframework.stereotype.Service

/**
 * @author mirzoevnik
 */
@Service
class MakeDecisionServiceImpl: MakeDecisionService {

    override fun makeDecision(income: Double, familyStatus: String, amount: Double, term: Int): String {
        var coef = 1.0
        if (familyStatus == "not married") {
            coef -= 0.2
        }

        coef -= when {
            income / (amount / term) <= 1 -> 0.6
            income / (amount / term) <= 2 -> 0.2
            income / (amount / term) <= 3 -> 0.1
            else -> 0.0
        }

        if (term <= 6) {
            coef -= 0.2
        } else if (term <= 12 || term >= 24) {
            coef -= 0.1
        }

        if (coef < 0.5) {
            return "denied"
        }
        return "approved"
    }
}