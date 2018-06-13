package ru.neoflex.nfo.microservices.data.input.model

import javax.persistence.*

/**
 * @author mirzoevnik
 */
@Entity
@Table
data class Client (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        var name: String? = null,
        var surname: String? = null,
        var patronymic: String? = null,
        var birthday: String? = null,
        var inn: String? = null,
        var snils: String? = null,
        var address: String? = null,
        var income: Double? = null,

        @Column(name = "FAMILY_STATUS")
        var familyStatus: String? = null
)