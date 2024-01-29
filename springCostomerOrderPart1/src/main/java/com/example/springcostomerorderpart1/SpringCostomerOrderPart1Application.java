package com.example.springcostomerorderpart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.springcostomerorderpart1","com.example.model","com.example.controller","com.example.repository",})
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repository")
public class SpringCostomerOrderPart1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCostomerOrderPart1Application.class, args);
	}

}
