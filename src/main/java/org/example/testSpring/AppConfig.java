package org.example.testSpring;

import org.example.PaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.testSpring")
public class AppConfig {
    @Bean
    public PaymentProcessor create() {
        return PaymentProcessor.builder().apiKey("test-key-123").commission(2.5).build();
    }
}
