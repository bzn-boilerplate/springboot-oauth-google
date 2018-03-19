package com.biznomy.application;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOauthApplication.class, args);
	}
	
	@RequestMapping(value="/user")
	public Principal userPricipal(Principal principal) {
		
		System.out.println(principal);
		return principal;
	}
}
