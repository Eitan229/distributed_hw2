package rest_api.repository.model

import com.example.api.repository.model.Tx
import java.math.BigInteger

data class CommittedTx(val Tx: Tx, val timestamp: BigInteger) {



}