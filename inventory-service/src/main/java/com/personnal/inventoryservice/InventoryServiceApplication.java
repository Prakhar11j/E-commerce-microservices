package com.personnal.inventoryservice;

import com.personnal.inventoryservice.model.Inventory;
import com.personnal.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//		return args -> {
//			Inventory inventory01 = new Inventory();
//			inventory01.setSkuCode("iphone_13_blue");
//			inventory01.setQuantity(100);
//
//			Inventory inventory02 = new Inventory();
//			inventory02.setSkuCode("iphone_13_red");
//			inventory02.setQuantity(0);
//
//			inventoryRepository.save(inventory01);
//			inventoryRepository.save(inventory02);
//
//		};
//	}

}
