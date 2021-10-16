package com.example.postalservices.postalservices.service;

import java.util.List;

import com.example.postalservices.postalservices.entity.Customer;


public interface CustomerService {
	
	public void addCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer updateCustomer(Customer customer);
	public Customer getCustomerById(Integer id);
}
                                                