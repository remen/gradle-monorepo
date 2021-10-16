package fizz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FizzApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<FizzApplication>(*args)
        }
    }
}
