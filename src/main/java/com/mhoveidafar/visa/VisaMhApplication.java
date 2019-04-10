package com.mhoveidafar.visa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@PropertySource(value = "${external_config1}/application.properties")
public class VisaMhApplication {

//	Implement a method that generates an instance of BCryptPasswordEncoder so that it can be injected in the userController class.
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(VisaMhApplication.class, args);
	}

}
