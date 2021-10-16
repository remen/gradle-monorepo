package monorepo.requestlogger

import org.slf4j.LoggerFactory
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

open class RequestLoggerFilter : OncePerRequestFilter() {
    private val slf4jLogger = LoggerFactory.getLogger(RequestLoggerFilter::class.java)

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        try {
            filterChain.doFilter(request, response)
        } finally {
            slf4jLogger.info("{} {} {}", request.method, request.requestURI, response.status)
        }
    }
}
