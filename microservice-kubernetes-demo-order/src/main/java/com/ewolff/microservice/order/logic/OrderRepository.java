package com.ewolff.microservice.order.logic;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

interface OrderRepository extends MongoRepository<Order, String> {

    List<Order> findAllById(String id);
    List<Order> findAll();
    Order save(Order customer);
    void deleteById(String id);
}
