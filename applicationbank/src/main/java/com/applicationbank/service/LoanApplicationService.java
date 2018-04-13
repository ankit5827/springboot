package com.applicationbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.LoanApplication;
import com.applicationbank.repository.BankRepository;
import com.applicationbank.repository.BranchRepository;
import com.applicationbank.repository.LoanApplicationRepository;

@Service
@Component
public class LoanApplicationService {

	public LoanApplicationService() {
		
	}

	@Autowired
	BankRepository bankRepository;
	@Autowired
	BranchRepository branchRepository;
	@Autowired
	LoanApplicationRepository loanApplicationRepository;
	
	public void save(LoanApplication loanApplication )
	{
		System.out.println("inside service");
		loanApplicationRepository.save(loanApplication);
	}
	public List<LoanApplication> findByCustomer(Customer customer) {
		System.out.println("inside service");
		return loanApplicationRepository.findByCustomer(customer);
	}

	
	public List<LoanApplication> findByBranchId(Branch branch) {
		System.out.println("inside loan application findByBranchid service");
		return loanApplicationRepository.findByBranch(branch);
	}
	
	
	
	
	
	
	
}
