package com.example.groceryspring;

import com.example.groceryspring.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GrocerySpringApplication implements CommandLineRunner {

    @Autowired
    ItemRepository groceryItemRepo;

    public static void main(String[] args) {
        SpringApplication.run(GrocerySpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
    }
}
