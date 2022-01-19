package com.example.kotlinCRUD

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController{

    @GetMapping
    fun index(): List<Employee> = listOf(
        Employee("1","Tahiru"),
        Employee("3","Fuseini")
    )
}