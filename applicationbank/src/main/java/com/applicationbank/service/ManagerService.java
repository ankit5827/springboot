package com.applicationbank.service;

import java.util.List;

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
	
/*	public List<Manager> managerFromBranch(Manager manager)
	{
		System.out.println("in managerFromBranch");
		return managerRepository.findByBranchid(manager);
	}
	*/

	public List<Manager> findByManagerid(Integer managerid)
	{
		System.out.println("inside findByManageridservice");
		return managerRepository.findByManagerid(managerid);
	}
	
	
}
