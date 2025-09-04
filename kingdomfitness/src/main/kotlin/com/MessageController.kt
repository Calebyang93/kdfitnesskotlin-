package.com.example.kingdomfitness 

import org.springframework.web.bind.annotation.GetMapping 
import org.springframework.web.bind.annotation.PostMapping 
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI 

@RestController 
@RequestMapping

    // used for showing the different text on kotlin with .kt: fun index(@RequestParam("name") name: String) = "Welcome to Kingdom Fitness, $name";

class MessageController {
    @GetMapping("/")
    fun listMessages() = listOf(
        Message("1", "Home"),
        Message("2", "Racquets"),
        Message("3", "Supplements"),
        Message("4", "Contact Us"),
    )
}

class MessageController(private val service: MessageService) {
    @GetMapping 
    fun listMessages() = service.findMessages()

    @PostMapping 
    fun post(@RequestBody message: Message): ResponseEntity<Message> {
        return ResponseEntity.created(URI("/${savedMessage.id}")).body(savedMessage)
    }
}