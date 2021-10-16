package com.example.postalservices.postalservices.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.postalservices.postalservices.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
