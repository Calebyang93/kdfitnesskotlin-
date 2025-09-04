package com.example.kingdomfitness

import org.springframework.stereotype.Service 
import org.springframework.jdbc.core.JdbcTemplate 
import java.util 

@Service 
class MessageService(private val db: JdbcTemplate) {
    fun findMessage(): List<Message> - db.query("select * from messages") {
        response, _ -> Message(response.getString("id"), response.getString("text"))
    }
    fun save(message: Message): Message {
        db.update(
            "insert into messages values ( ?, ? )",
            message.id, message.text
            // include name, message.date, message.lang, message.date in future iterations 
        )
        return message
    }
}