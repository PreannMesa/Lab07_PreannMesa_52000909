package com.example.lab07_Exercise1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab07Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab07Application.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Hello, Spring Boot!");
			// You can print any additional message or perform other operations here.
		};
	}

}
