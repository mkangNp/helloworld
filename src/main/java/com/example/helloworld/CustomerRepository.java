package com.example.helloworld;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<com.example.helloworld.Customer, String> {

	public com.example.helloworld.Customer findByFirstName(String firstName);
	public List<com.example.helloworld.Customer> findByLastName(String lastName);

}
