package ru.neoflex.nfo.microservices.data.input.model

import java.util.*
import javax.persistence.*

/**
 * @author mirzoevnik
 */
@Entity
@Table(name = "application")
data class CreditApplication (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @OneToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "client_id")
        var client: Client? = null,

        var amount: Double? = null,

        @Column(name = "START_DATE")
        var startDate: Date? = null,

        var rate: Double? = null,

        var term: Int? = null,

        @Column(name = "PRODUCT_NAME")
        var productName: String? = null,

        var executor: String? = null,

        var status: String? = null,

        var piid: String? = null
)