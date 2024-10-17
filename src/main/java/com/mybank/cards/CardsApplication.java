package com.mybank.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.mybank.cards.config.ExternalConfig;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(title = "Cards microservice REST API Documentation", 
description = "EazyBank Cards microservice REST API Documentation", version = "v1",
contact = @Contact(name = "Jaffa na jafada", email = "jaffa@gmail.com", 
url = "https://www.google.com"), 
license = @License(name = "Apache 2.0", url = "https://www.google.com")),
externalDocs = @ExternalDocumentation(description = "EazyBank Cards microservice REST API Documentation", 
url = "https://www.google.com"))
@EnableConfigurationProperties(value = ExternalConfig.class)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
