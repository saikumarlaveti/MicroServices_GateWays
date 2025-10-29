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
@Order(0) // High priority
public class GatewayPreFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(GatewayPreFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        var request = exchange.getRequest();

        logger.info("===== From GatewayPreFilter =====");
        logger.info("Request URI       : {}", request.getURI());
        logger.info("Request Path      : {}", request.getPath());
        logger.info("Request Method    : {}", request.getMethod());
        logger.info("Request Headers   : {}", request.getHeaders());
        logger.info("Remote Address    : {}", request.getRemoteAddress());

        return chain.filter(exchange); // continue to next filter
    }
}
