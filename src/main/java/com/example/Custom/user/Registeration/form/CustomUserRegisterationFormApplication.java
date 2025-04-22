package com.example.Custom.user.Registeration.form;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication

public class CustomUserRegisterationFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomUserRegisterationFormApplication.class, args);
	}
	@Bean
	public CommandLineRunner testDatabaseConnection(JdbcTemplate jdbcTemplate) {
		return args -> {
			try {
				String query = "SELECT 1";
				Integer result = jdbcTemplate.queryForObject(query, Integer.class);
				if (result != null && result == 1) {
					System.out.println("Database connection successful!");
				}
			} catch (Exception e) {
				System.out.println("Database connection failed: " + e.getMessage());
			}
		};
	}

}
