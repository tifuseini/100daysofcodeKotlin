package com.example.kotlinCRUD

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository


interface EmployeeRepository : CrudRepository<Employee,String>{

    @Query("select * from messages")
    fun findMessages(): List<Employee>
}