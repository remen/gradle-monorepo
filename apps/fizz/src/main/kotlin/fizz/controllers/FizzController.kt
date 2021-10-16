package fizz.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FizzController {
    @GetMapping("/fizz")
    fun fizz(): List<Any> {
        return (1..10).map { if (it % 3 == 0) "Fizz" else it  }
    }
}
