package com.applicationbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.LoanType;
import com.applicationbank.repository.LoanTypeRepository;

@Service
@Component
public class LoanTypeService {

	public LoanTypeService() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	LoanTypeRepository loanTypeRepository;
	public List<LoanType> findByBranch(Branch branch) {
		System.out.println("inside  loan type  service");
		return loanTypeRepository.findByBranch(branch);
	}
	
	
	
	
	

}
