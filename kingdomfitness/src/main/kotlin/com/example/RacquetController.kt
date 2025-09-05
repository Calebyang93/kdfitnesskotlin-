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
        Racquet("1", "Tennis","Babolat", "SSAAS-34sdsd", "150", "INR"),
        Racquet("2", "Pickleball", "joomla","23nd2-AdvancedCCTFibure","80","SGD"),
        Racquet("3", "Squash","Wilson","1238-asdv-brave","120", "MYR"),
        Racquet("4","Badmintion","Yonex","23123-asdvbawd","95000","KHR")
        Racquet("4","Baseball", "Wilson","2312-carboncomposite123", "130", "HKD"),
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