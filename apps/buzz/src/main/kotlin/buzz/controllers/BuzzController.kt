package buzz.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BuzzController {
    @GetMapping("/buzz")
    fun fizz(): List<Any> {
        return (1..10).map { if (it % 5 == 0) "Buzz" else it  }
    }
}
