package com.example.mobile.number.service

import com.example.mobile.number.model.Mobile
import com.example.mobile.number.repository.MobileRepository
import org.springframework.stereotype.Service


@Service
class MobileService (val db:MobileRepository){
    fun findMobile(): List<Mobile> = db.findMessages()

    fun post(mobile: Mobile){
        db.save(mobile)
    }
}