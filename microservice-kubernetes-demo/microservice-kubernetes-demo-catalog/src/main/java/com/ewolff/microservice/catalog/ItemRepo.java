package com.ewolff.microservice.catalog;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "catalog", path = "catalog")
public interface ItemRepo extends MongoRepository<Item, String> {

    List<Item> findAllByName(@Param("name") String name);
}
