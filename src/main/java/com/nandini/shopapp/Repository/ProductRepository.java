package com.nandini.shopapp.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.nandini.shopapp.Model.Product;

@EnableMongoRepositories
@Repository
public interface ProductRepository extends MongoRepository<Product, Integer>{
	
	public List<Product> findAll();
	public Product findByProductName(String ProductName);
	public List<Product> findByProductIdIn(List<String> ProductIdList);
}
