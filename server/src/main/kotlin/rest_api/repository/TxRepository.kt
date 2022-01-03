package com.example.api.repository

import com.example.api.repository.model.Tx
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TxRepository : JpaRepository<Tx, Long>