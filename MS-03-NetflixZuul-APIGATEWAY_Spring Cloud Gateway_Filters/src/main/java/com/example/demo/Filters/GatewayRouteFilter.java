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
@Order(2)
public class GatewayRouteFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(GatewayRouteFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        String routeId = exchange.getAttribute("org.springframework.cloud.gateway.support.ServerWebExchangeUtils.gatewayRouteId");
        String requestUrl = String.valueOf(exchange.getAttribute("org.springframework.cloud.gateway.support.ServerWebExchangeUtils.gatewayRequestUrl"));

        logger.info("======== From GatewayRouteFilter =========");
        logger.info("Route ID     : {}", routeId);
        logger.info("Target URL   : {}", requestUrl);

        return chain.filter(exchange);
    }
}
