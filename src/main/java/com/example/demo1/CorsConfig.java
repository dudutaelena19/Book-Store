package com.example.demo1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/books") // Specifice calea pentru care se aplică configurarea CORS
                .allowedOrigins("http://localhost:3001") // Originea permisă (adresa frontend-ului)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Metodele HTTP permise
                .allowedHeaders("*") // Toate headerele permise
                .allowCredentials(true); // Permite utilizarea credențialelor (e.g., cookie-uri)
    }
}
