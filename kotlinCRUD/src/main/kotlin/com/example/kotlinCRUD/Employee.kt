package com.example.kotlinCRUD

import org.hibernate.annotations.Table
import javax.persistence.Id

@Table(appliesTo = "MESSAGES")
data class Employee(@Id val id:String, val name:String)