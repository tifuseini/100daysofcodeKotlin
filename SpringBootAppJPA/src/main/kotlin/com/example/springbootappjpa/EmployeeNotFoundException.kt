package com.example.springbootappjpa



internal class EmployeeNotFoundException(id: Long) : RuntimeException("Could not find employee $id")