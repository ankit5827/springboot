package com.applicationbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.applicationbank.repository.BankRepository;
import com.applicationbank.repository.BranchRepository;

@Service
@Component
public class LoanApplicationService {

	public LoanApplicationService() {
		
	}

	@Autowired
	BankRepository bankRepository;
	@Autowired
	BranchRepository branchRepository;
	
	
	
	
	
	
	
	
	
}
