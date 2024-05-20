package dev.naamad.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "log-service")
@Data
public class LogServiceConfig {
    private String logServiceUrl;
}
