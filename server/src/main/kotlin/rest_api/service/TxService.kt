package com.example.api.service

import com.example.api.repository.model.Tr
import com.example.api.repository.model.Tx
import com.example.api.repository.model.UTxO
import org.springframework.stereotype.Service
import rest_api.repository.ServerData
import rest_api.repository.model.CommittedTx
import java.math.BigInteger

/**
 * Service for interactions with employee domain object
 */
@Service
class TxService(val server: ServerData) {

    /**
     * Get all employees list.
     *
     * @return the list
     */
    fun createTxFromTr(accountID : java.math.BigInteger, payload : Tr) : Tx {
        //checkClientInShard()
        //if false, send gRPC request to createTxFromTr (to omega?)
        //do consensus to get the order


    }

    fun createTxFromList(accountID: java.math.BigInteger, payload : List<Tx> ) : List<Tx> {

    }

    fun getAccountUnspent(accountID: java.math.BigInteger): List<UTxO>
    {
        //checkClientInShard()
        //if false, send gRPC request to getAccountUnspent
        //if true
        return server.getUserUTxOs(accountID);
    }

    fun getAccountTransactionHistory(accountID: BigInteger, limit : Int): List<CommittedTx> {
        //checkClientInShard()
        //if false, send gRPC request to getAccountTransactionHistory
        //if true
        return server.getUserTxs(accountID,limit);
    }

    fun getGlobalTransactionHistory(limit: Int) {

    }
//    fun getAllEmployees(): List<Employee> = employeeRepository.findAll()
//
//    /**
//     * Gets employees by id.
//     *
//     * @param employeeId the employee id
//     * @return the employee by id
//     * @throws EmployeeNotFoundException the employee not found exception
//     */
//    fun getEmployeesById(employeeId: Long): Employee = employeeRepository.findById(employeeId)
//            .orElseThrow { EmployeeNotFoundException(HttpStatus.NOT_FOUND, "No matching employee was found") }
//
//    /**
//     * Create employee.
//     *
//     * @param employee the employee
//     * @return the employee
//     */
//    fun createEmployee(employee: Employee): Employee = employeeRepository.save(employee)
//
//    /**
//     * Update employee.
//     *
//     * @param employeeId the employee id
//     * @param employee the employee details
//     * @return the employee
//     * @throws EmployeeNotFoundException the employee not found exception
//     */
//    fun updateEmployeeById(employeeId: Long, employee: Employee): Employee {
//        return if (employeeRepository.existsById(employeeId)) {
//            employeeRepository.save(
//                    Employee(
//                            id = employee.id,
//                            userName = employee.userName,
//                            firstName = employee.firstName,
//                            middleName = employee.middleName,
//                            lastName = employee.lastName,
//                            emailId = employee.emailId,
//                            dayOfBirth = employee.dayOfBirth,
//                            //hi = employee.hi
//                    )
//            )
//        } else throw EmployeeNotFoundException(HttpStatus.NOT_FOUND, "No matching employee was found")
//    }
//
//    /**
//     * Delete employee.
//     *
//     * @param employeeId the employee id
//     * @return the map
//     * @throws EmployeeNotFoundException the employee not found exception
//     */
//    fun deleteEmployeesById(employeeId: Long) {
//        return if (employeeRepository.existsById(employeeId)) {
//            employeeRepository.deleteById(employeeId)
//        } else throw EmployeeNotFoundException(HttpStatus.NOT_FOUND, "No matching employee was found")
//    }
}