// src/main/java/umg/edu/catalogo/config/WebCorsConfig.java
package umg.edu.catalogo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebCorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(
                        "http://localhost:3000",
                        "http://localhost:5173",
                        "http://127.0.0.1:3000",
                        "http://127.0.0.1:5173"
                ) // agrega el puerto desde el que sirves el HTML
                .allowedMethods("GET","POST","PUT","PATCH","DELETE","OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(false)
                .maxAge(3600);
    }
}