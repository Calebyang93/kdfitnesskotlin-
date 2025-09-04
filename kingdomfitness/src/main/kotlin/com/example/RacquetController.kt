package com.example.kingdomfitness

import org.springframework.web.bind.annotation.GetMapping 
import org.springframework.web.bind.annotation.PostMapping 
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI 

@RestController
@RequestMapping

class RacquetController {
    @GetMapping("/")
    fun listRacquets = listOf(
        Racquet("1", "Tennis Babolat SSAAS"),
        Racquet("2", "Pickleball paddle joomla advanced"),
        Racquet("3", "Squash Wilson Racquet"),
        Racquet("4","Baseball CCT 28/30/32 Inch metal"),
    )
}

class RacquetController(private val service: RacquetService) {
    @GetMapping 
    fun listRacquets() = service.findRacquets()

    @PostMapping 
    fun post(@RequestBody racquet: Racquet): ResponseEntity<Racquet> {
        return ResponseEntity.created(URI("/${savedRacquet.id}")).body(savedRacquet)
    }
}