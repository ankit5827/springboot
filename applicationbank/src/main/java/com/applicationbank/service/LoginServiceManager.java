package com.applicationbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.Manager;
import com.applicationbank.repository.CustomerRepository;
import com.applicationbank.repository.ManagerRepository;

@Service
@Component
public class LoginServiceManager {
	@Autowired
	private ManagerRepository managerRepository;

	
	
	
	public List<Manager> findByManageridAndPassword(Integer managerid, String password) {
		System.out.println("inside service");
		return managerRepository.findByManageridAndPassword(managerid, password);
	}

}
