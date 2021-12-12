package com.peligros.test.mw002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Mw002Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Mw002Application.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

}
