package com.example.kotlinCRUD

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController(val repo : EmployeeRepository) {

    

    @PostMapping("/employee")
    fun addEmployee(@RequestBody employee: Employee){
        repo.save(employee)
    }

    @GetMapping("/employee")
    fun getAllEmployees() = repo.findAll().toList()
}