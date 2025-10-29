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
@Order(1)
public class GatewayPostFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(GatewayPostFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        return chain.filter(exchange).then(
            Mono.fromRunnable(() -> {
                var response = exchange.getResponse();

                logger.info("======== From GatewayPostFilter =========");
                logger.info("Response Status Code : {}", response.getStatusCode());
                logger.info("Response Headers     : {}", response.getHeaders());
            })
        );
    }
}
