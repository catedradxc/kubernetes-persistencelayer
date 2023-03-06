package com.ewolff.microservice.catalog;

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
public class CatalogApp {

	private final ItemRepo itemRepo;

	@Autowired
	public CatalogApp(ItemRepo itemRepository) {

		this.itemRepo = itemRepository;
	}

	@PostConstruct
	public void generateTestData() {
		itemRepo.save(new Item("a", "iPod", 42.0));
		itemRepo.save(new Item("b","iPod touch", 21.0));
		itemRepo.save(new Item("c","iPod nano", 1.0));
		itemRepo.save(new Item("d","Apple TV", 100.0));
	}

	public static void main(String[] args) {
		SpringApplication.run(CatalogApp.class, args);
	}

}
