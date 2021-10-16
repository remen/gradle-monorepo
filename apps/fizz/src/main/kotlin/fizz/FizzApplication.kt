package fizz

import monorepo.requestlogger.RequestLoggerFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class FizzApplication {
    @Bean
    open fun requestLoggerFilter(): RequestLoggerFilter {
        return RequestLoggerFilter()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<FizzApplication>(*args)
        }
    }
}
