package com.example.Vacina;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VacinaProjectMain {

	public static void main(String[] args) {
		SpringApplication.run(VacinaProjectMain.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Aplicação Campanhas/Vacinas/Funcionarios")
						.version("1.0")
						.description("Trabalho final de Back-end, Campanhas de vacinação, Feito por: Pedro Martins e Leonardo Vilhena")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
