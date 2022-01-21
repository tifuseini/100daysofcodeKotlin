package com.example.kotlinCRUD

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeResource(val service: EmployeeService) {

    @GetMapping
    fun index(): List<Employee> = service.findEmployees()

}