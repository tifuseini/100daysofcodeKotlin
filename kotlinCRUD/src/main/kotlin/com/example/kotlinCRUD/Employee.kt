package com.example.kotlinCRUD

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("MESSAGES")
data class Employee(@Id val id:String, val name:String)