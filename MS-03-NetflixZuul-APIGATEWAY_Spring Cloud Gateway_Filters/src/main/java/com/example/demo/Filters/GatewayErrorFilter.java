package com.example.demo.Filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import reactor.core.publisher.Mono;

@Component
@Order(-1) // Run before other filters for error handling
public class GatewayErrorFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(GatewayErrorFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return chain.filter(exchange).onErrorResume(throwable -> {
            logger.error("===== From GatewayErrorFilter =====");
            logger.error("Exception type   : {}", throwable.getClass().getName());
            logger.error("Exception message: {}", throwable.getMessage());

            // Optionally log the request URI safely
            if (exchange.getRequest() != null) {
                logger.error("Request URI      : {}", exchange.getRequest().getURI().toString());
            }

            // Return empty response to avoid crashing Gateway
            exchange.getResponse().setStatusCode(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
            return exchange.getResponse().setComplete();
        });
    }
}
