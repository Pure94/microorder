package com.microorder.productservice.productmanager;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProductRepository extends MongoRepository<ProductEntity, String>
{ }
