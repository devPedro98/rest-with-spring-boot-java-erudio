package br.com.erudio.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    private static final String URL = "https://pub.erudio.com.br/meus-cursos\"";

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Restful Api with Java 21 and Spring Boot 3")
                        .version("v1")
                        .description("Some description about our API")
                        .termsOfService(URL)
                        .license(new License().name("Apache 2.0")
                                .url(URL)));
    }
}
