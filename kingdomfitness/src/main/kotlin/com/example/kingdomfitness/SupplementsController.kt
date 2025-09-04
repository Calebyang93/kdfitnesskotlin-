package com.example.kingdomfitness

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping

class SupplementController {
    @GetMapping("/")
    fun listSuppplement = listOf(
        Supplement("1", "Omega Oil Zinzino"),
        Supplement("2", "Tegreen Nu Skin "),
        Supplement("3", "Ultimate Duo Nu Skin"),
        Supplement("4","Multivitatmins Nutriliate Amway"),
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