package com.library.next;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition     //http://localhost:8080/swagger-ui/index.html
public class NextApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextApplication.class, args);
	}

}
