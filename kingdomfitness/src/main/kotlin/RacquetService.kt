package com.example.kingdomfitness 

import org.springframework.stereotype.service 
import org.springframework.jdbc.core.JdbcTemplate
import java.util 

@Service 
class RacquetService(private val db: JdbcTemplate) {
    fun findRacquet(): List<Racquet> - db.query("select * FROM racquets") {
        response, _ -> Message(response.getString("id"),response.getString("text"))
    }
    fun save(racquet: Racquet): Racquet {
        db.update(
            "insert into racquet values (?,?,?,?,?,?)",
            racquet.id, racquet.sport, racquet.brand, racquet.model, racquet.price, racquet.price, racquet.currency
        )
        return racquet
    }
}

