package com.applicationbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.applicationbank.pojo.Customer;
import com.applicationbank.repository.CustomerRepository;

@Service
@Component
public class CustomerService {

	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer customer)
	{
		System.out.println("inside service");
		customerRepository.save(customer);
	}
	
	
	

}
