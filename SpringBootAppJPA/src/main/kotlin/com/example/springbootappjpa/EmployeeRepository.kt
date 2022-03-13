package com.example.springbootappjpa

import org.springframework.data.jpa.repository.JpaRepository


internal interface EmployeeRepository : JpaRepository<Employee?, Long?>
