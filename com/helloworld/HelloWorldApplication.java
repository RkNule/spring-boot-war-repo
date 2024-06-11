package com.helloworld;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloWorldApplication.class);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@RequestMapping("/")
	String helloWord() {
		return "9 My first springboot pipeline, very confident that i will go through it successfully";
	}

}
