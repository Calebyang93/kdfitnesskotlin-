package com.example.kingdomfitness

import org.springframework.stereotype.service
import org.springframework.jdbc.core.JdbcTemplate
import java.util

@Service 
class SupplementService(private val db: JdbcTemplate) {
    response, _ -> Supplement(respose.getString("id"),response.getString("text"))
}
fun save(supplement: Supplement): Supplement {
    db.update(
        "insert into supplement values (?,?,?,?,?)",
        supplement.id, supplement.product, supplement.brand, supplement.price, supplement.currency
    )
    return supplement
}
