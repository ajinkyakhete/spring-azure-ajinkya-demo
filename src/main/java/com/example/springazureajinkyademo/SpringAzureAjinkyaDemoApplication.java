package com.example.springazureajinkyademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureAjinkyaDemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Congrats! your app deployed successfully on azure !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureAjinkyaDemoApplication.class, args);
	}

}
