package com.applicationbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.applicationbank.pojo.Bank;
import com.applicationbank.repository.BankRepository;

@Service
@Component
public class BankService {

	public BankService() {
		
	}
	@Autowired
	BankRepository bankRepository;
	
	
	public List<Bank> findAll(Bank bank)
	{
		System.out.println("inside Bank service");
		return (List<Bank>) bankRepository.findAll();
	}
	
	
	

}
