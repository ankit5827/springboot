package com.databse.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.demo.pojo.Customer;
import com.database.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	public CustomerService() {
		
	}
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer customer)
	{
		System.out.println("inside service");
		customerRepository.save(customer);
	}
	
	
	

}
