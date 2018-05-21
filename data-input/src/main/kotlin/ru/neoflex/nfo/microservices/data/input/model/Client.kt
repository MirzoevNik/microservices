package ru.neoflex.nfo.microservices.data.input.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * @author mirzoevnik
 */
@Document
data class Client (
        @Id
        val id: String,
        val name: String,
        val surname: String,
        val patronymic: String,
        val birthday: Date,
        val inn: String
)