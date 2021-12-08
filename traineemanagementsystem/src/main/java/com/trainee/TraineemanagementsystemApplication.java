package com.trainee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TraineemanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineemanagementsystemApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello Capgemini";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome Capgemini";
	}
}
