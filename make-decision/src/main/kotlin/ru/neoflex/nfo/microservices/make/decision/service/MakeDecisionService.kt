package ru.neoflex.nfo.microservices.make.decision.service

/**
 * @author mirzoevnik
 */
interface MakeDecisionService {

    fun makeDecision(income: Double, familyStatus: String, amount: Double, term: Int): String
}