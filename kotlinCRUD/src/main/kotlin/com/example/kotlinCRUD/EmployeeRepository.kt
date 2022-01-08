package com.example.kotlinCRUD

import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<Employee,Long>{

}