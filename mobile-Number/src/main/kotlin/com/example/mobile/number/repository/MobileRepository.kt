package com.example.mobile.number.repository

import com.example.mobile.number.model.Mobile
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface MobileRepository : CrudRepository<Mobile,Long>{

    @Query("select * from messages")
    fun findMessages(): List<Mobile>

}