package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CloudConfigServer {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/phones/**")
                        .uri("http://localhost:8082/"))
                .route(r -> r.path("/Cart/**")
                        .uri("http://localhost:8083/"))
                .route(r -> r.path("/User/**")
                        .uri("http://localhost:8084/"))
                .build();
    }
}
	