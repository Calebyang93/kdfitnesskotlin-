package com.example.kingdomfitness

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping

class SupplementController {
    @GetMapping("/")
    fun listSuppplement = listOf(
        Supplement("1", "Omega Balance Oil", "Zinzino", "19.99", "NOK"),
        Supplement("2", "Tegreen", "Nuskin", "35.55", "USD"),
        Supplement("3", "Ultimate Duo", "Nuskin","39.28", "RMB"),
        Supplement("4","Multivitatmins Nutriliate","Amway","25.57", "USD"),
    )
}

class SupplementController(private val service: SupplementService) {
    @GetMapping 
    fun listSupplement() = service.findSupplement()

    @PostMapping 
    fun post(@RequestBody supplement: Supplement): ResponseEntity<Supplement> {
        return ResponseEntity.created(URI("/${savedSupplement.id}")).body(savedSupplement)
    }
}