package com.example.api.repository.model


import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * Represents the database entity for storing the employee details.
 */
@Entity
@Table(name = "Tx")
data class Tx(
//        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//        val id: Long?,
        @Column(name = "TxID", unique = true, nullable = false)
        val TxID: java.math.BigInteger,
        @Column(name = "inputs", nullable = false)
        val inputs: List<UTxO>,
        @Column(name = "outputs", nullable = false)
        val outputs: List<Tr>

)