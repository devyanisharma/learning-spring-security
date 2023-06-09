package com.example.securityDemo;

import com.example.securityDemo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SecurityDemoApplication.class, args);
	}

}
