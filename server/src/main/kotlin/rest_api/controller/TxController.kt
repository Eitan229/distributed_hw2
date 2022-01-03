package com.example.api.controller

import com.example.api.repository.model.Tx
import com.example.api.repository.model.Tr
import com.example.api.service.TxService
import org.springframework.web.bind.annotation.*


/**
 * Controller for REST API endpoints
 */
@RestController
class TxController(private val txService: TxService) {

//    @PutMapping("/accounts/{id}/transactions")
//    fun createTxFromTx(@PathVariable("id") accountID: java.math.BigInteger,
//                  @RequestBody payload: Tx): Tx =
//            txService.createTxFromTx(accountID, payload)

    @PostMapping("/accounts/{id}/transactions")
    fun createTxFromTr(@PathVariable("id") accountID: java.math.BigInteger,
                 @RequestBody payload: Tr): Tx =
            txService.createTxFromTr(accountID, payload)

    @PutMapping("/accounts/{id}/transactions")
    fun createTxFromList(@PathVariable("id") accountID: java.math.BigInteger,
                       @RequestBody payload: List<Tx>): List<Tx> =
            txService.createTxFromList(accountID, payload)

    @GetMapping("/accounts/{id}/transactions")
    fun getAccountUnspent(@PathVariable("id") accountID: java.math.BigInteger,
                          @RequestParam(defaultValue = "false") unspent : Boolean,
                          @RequestParam(defaultValue = "-1") limit : Int
    ) : Any  {
        if (unspent)
            return txService.getAccountUnspent(accountID)
        else{
            return txService.getAccountTransactionHistory(accountID,limit)
        }
    }

    @GetMapping("/transactions")
    fun getAccountUnspent(@RequestParam(defaultValue = "-1") limit : Int
    ) {
        return txService.getGlobalTransactionHistory(limit)
    }


}