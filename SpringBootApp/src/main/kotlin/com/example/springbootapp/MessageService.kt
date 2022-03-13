package com.example.springbootapp

import org.springframework.data.annotation.Id
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
class MessageService(val db:MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }

}