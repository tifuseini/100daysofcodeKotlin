package com.example.springbootappjpa

import org.springframework.web.bind.annotation.*
import java.util.function.Function
import java.util.function.Supplier


@RestController
internal class EmployeeController(private val repository: EmployeeRepository) {
    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    fun all(): List<Employee?> {
        return repository.findAll()
    }

    // end::get-aggregate-root[]
    @PostMapping("/employees")
    fun newEmployee(@RequestBody newEmployee: Employee): Employee {
        return repository.save(newEmployee)
    }

    // Single item
    @GetMapping("/employees/{id}")
    fun one(@PathVariable id: Long): Employee {
        return repository.findById(id)
            .orElseThrow(Supplier<RuntimeException> { EmployeeNotFoundException(id) })!!
    }

    @PutMapping("/employees/{id}")
    fun replaceEmployee(@RequestBody newEmployee: Employee, @PathVariable id: Long): Employee {
        return repository.findById(id)
            .map<Employee>(Function { employee: Employee ->
                employee.name = newEmployee.name
                employee.role = newEmployee.role
                repository.save(employee)
            })
            .orElseGet {
                newEmployee.id = id
                repository.save(newEmployee)
            }
    }

    @DeleteMapping("/employees/{id}")
    fun deleteEmployee(@PathVariable id: Long) {
        repository.deleteById(id)
    }
}