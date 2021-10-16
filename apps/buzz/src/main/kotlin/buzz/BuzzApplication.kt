package buzz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BuzzApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<BuzzApplication>(*args)
        }
    }
}
