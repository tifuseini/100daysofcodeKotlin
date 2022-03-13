package com.example.springbootapp

import org.springframework.web.bind.annotation.*

@RestController
class MessageResource(
    val service  : MessageService,
    val repository: MessageRepository) {
    @GetMapping
    fun index() : List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }

    @DeleteMapping("/id")
    fun delete(@PathVariable id : String){
        repository.deleteById(id)
    }
}