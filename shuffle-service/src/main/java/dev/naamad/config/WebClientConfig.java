package dev.naamad.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${log-service.logServiceUrl}")
    private String logServiceUrl;


    @Bean
    public WebClient logServiceWebClient() {
        return WebClient.builder()
                .baseUrl(logServiceUrl)
                .build();
    }
}
