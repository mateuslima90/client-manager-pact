package io.mkth.clientmanagerpact.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {

    @Bean("managerClient")
    public WebClient clientManagerClient() {
        return WebClient
                .builder()
                .baseUrl("http://localhost:3000")
                .build();
    }
}
