package com.example.api.repository.model


import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue

/**
 * Represents the database entity for storing the employee details.
 */
@Entity
@Table(name = "Tr")
data class Tr(
//        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//        val id: Long?,
        @Column(name = "address",nullable = false)
        val address: java.math.BigInteger,
        @Column(name = "amount", nullable = false)
        val amount: ULongValue

)