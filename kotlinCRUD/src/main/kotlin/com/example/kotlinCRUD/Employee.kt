package com.example.kotlinCRUD

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Employee(@Id @GeneratedValue val id:Long,
               val firstName:String,
               val lastName:String,
               val age:Int)