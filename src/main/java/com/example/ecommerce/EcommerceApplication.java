package com.example.ecommerce;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args)
	{
		loadDotEnvPros();
		SpringApplication.run(EcommerceApplication.class, args);
	}

	public static void loadDotEnvPros()
	{
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach(
				dotenvEntry -> System.setProperty(dotenvEntry.getKey(), dotenvEntry.getValue())
		);
	}
}




