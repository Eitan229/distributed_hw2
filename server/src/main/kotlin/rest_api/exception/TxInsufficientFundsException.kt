package com.example.api.exception

import org.springframework.http.HttpStatus

class TxInsufficientFundsException(val statusCode: HttpStatus, val reason: String) : Exception()