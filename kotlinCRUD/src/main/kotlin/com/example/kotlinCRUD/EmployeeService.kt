package com.example.kotlinCRUD

import org.springframework.stereotype.Service

@Service
class EmployeeService (val db: EmployeeRepository){

    fun findEmployees() : List<Employee> = db.findEmployees()

    fun post(employee: Employee){
        db.save(employee)
    }
}