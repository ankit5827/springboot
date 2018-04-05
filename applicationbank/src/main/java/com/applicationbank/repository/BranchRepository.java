package com.applicationbank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.Customer;

@Repository
public interface BranchRepository  extends CrudRepository<Branch, Integer>{
	
	
	List<Branch> findByBank(Bank bank);

}
