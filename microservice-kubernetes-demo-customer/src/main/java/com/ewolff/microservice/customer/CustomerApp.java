package com.ewolff.microservice.customer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@ComponentScan
@EnableAutoConfiguration
@Component
@EnableMongoRepositories
public class CustomerApp {

	private final CustomerRepo customerRepo;

	@Autowired
	public CustomerApp(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	@PostConstruct
	public void generateTestData() {
		customerRepo
				.save(new Customer("a","Eberhard", "Wolff",
						"eberhard.wolff@gmail.com", "Unter den Linden", "Berlin"));
		customerRepo
				.save(new Customer("b", "Rod", "Johnson",
						"rod@somewhere.com", "Market Street", "San Francisco"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApp.class, args);
	}

}
