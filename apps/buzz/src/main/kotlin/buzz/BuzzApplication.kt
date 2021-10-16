package buzz

import monorepo.requestlogger.RequestLoggerFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class BuzzApplication {
    @Bean
    open fun requestLoggerFilter(): RequestLoggerFilter {
        return RequestLoggerFilter()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<BuzzApplication>(*args)
        }
    }
}
