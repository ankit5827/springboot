package com.applicationbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.applicationbank.pojo.Manager;
import com.applicationbank.repository.ManagerRepository;

@Service
@Component
public class ManagerService {

	
	@Autowired
	private ManagerRepository managerRepository;
	
	public void save(Manager manager)
	{
		System.out.println("inside service");
		managerRepository.save(manager);
	}
	
	
	

}
