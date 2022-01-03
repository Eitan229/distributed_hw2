package rest_api.repository

import com.example.api.repository.model.Tx
import com.example.api.repository.model.UTxO
import rest_api.repository.model.CommittedTx
import java.math.BigInteger
import java.util.*
import java.util.stream.Collectors

class ServerData() {

    private var UTxOHash: HashMap<java.math.BigInteger,List<UTxO>> = HashMap()
    private var sentHash : HashMap<java.math.BigInteger,List<CommittedTx>> = HashMap()
    private var receivedHash : HashMap<java.math.BigInteger,List<CommittedTx>> = HashMap();

    fun getUserUTxOs(accountID : java.math.BigInteger):List<UTxO> {
        return UTxOHash[accountID]?:ArrayList<UTxO>();
    }
    fun getUserTxs(accountID: java.math.BigInteger,limit:Int):List<CommittedTx> {
        if (limit==-1) {
            return java.util.stream.Stream.concat(sentHash[accountID]?.stream(), receivedHash[accountID]?.stream())
                    .sorted({ o1: CommittedTx, o2: CommittedTx -> o1.timestamp.compareTo(o2.timestamp) })
                    .collect(Collectors.toList());
        }
        else {
            return java.util.stream.Stream.concat(sentHash[accountID]?.stream(), receivedHash[accountID]?.stream())
                    .sorted({ o1: CommittedTx, o2: CommittedTx -> o1.timestamp.compareTo(o2.timestamp) }).limit(limit.toLong())
                    .collect(Collectors.toList())
        }

    }
}