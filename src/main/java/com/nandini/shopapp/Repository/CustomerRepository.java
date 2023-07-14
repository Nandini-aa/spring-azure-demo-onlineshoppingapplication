package com.nandini.shopapp.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nandini.shopapp.Model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
