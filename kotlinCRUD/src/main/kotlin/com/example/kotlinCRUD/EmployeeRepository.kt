package com.example.kotlinCRUD

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository


interface EmployeeRepository : CrudRepository<Employee,String>{

    @Query("select * from messages")
    fun findEmployees(): List<Employee>
}