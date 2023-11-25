package com.example.demospringappservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringAppServiceApplication {

	@GetMapping("/message")
	public String message() {
		return "Congrats! Your App is deployed!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAppServiceApplication.class, args);
	}

}
