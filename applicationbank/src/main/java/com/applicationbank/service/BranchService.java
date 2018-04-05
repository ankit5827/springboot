package com.applicationbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.Customer;
import com.applicationbank.repository.BranchRepository;

@Service
@Component
public class BranchService {

	public BranchService() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	BranchRepository branchRepository;
	
	
	public List<Branch> findByBank(Bank bank) {
		System.out.println("inside  Branch service");
		return branchRepository.findByBank(bank);
	}
	
	/*BranchRepository branchRepository;
	public List<Bank> findAll(Bank bank)
	{
		System.out.println("inside service");
		return (List<Bank>) bankRepository.findAll();
	}
*/
}
