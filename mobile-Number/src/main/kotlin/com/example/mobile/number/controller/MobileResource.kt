package com.example.mobile.number.controller

import com.example.mobile.number.model.Mobile
import com.example.mobile.number.service.MobileService
import org.springframework.web.bind.annotation.GetMapping

class MobileResource (val service: MobileService){

    @GetMapping
    fun index():List<Mobile> = listOf(
        Mobile(1,"2334444","T3ruhre"),
    )
}