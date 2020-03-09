package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.example.controller.PersonController;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan
public class PersonsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonsServiceApplication.class, args);
		
		System.out.println("in main thread");
		System.out.println(getMyBean());
	}
	
	@Bean(name="PersonController", initMethod="beanInit")
	public static PersonController getMyBean() {
		return new PersonController();
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
