package com.springrest.SpringRestApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.SpringRestApp.model.Order;


@Repository
public interface OrderRepo extends MongoRepository<Order, String> {
    
}
