package demo.controller

import demo.model.Message
import demo.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val service: MessageService){

    @GetMapping
    fun index(): List<Message> = listOf(
        Message("1","Hello"),
        Message("2","Bonjour"),
        Message("3","Privet"),
        Message("4","Ayekoo")
    )

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}