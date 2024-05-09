package com.personal.productmicroservice.repository;

import com.personal.productmicroservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
