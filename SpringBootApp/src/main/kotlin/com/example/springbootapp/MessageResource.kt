package com.example.springbootapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource {
    @GetMapping
    fun index() : List<Message> = listOf(
        Message("1","This is number 1"),
        Message("2","This is number 2"),
        Message("3","this is number 3")
    )
}