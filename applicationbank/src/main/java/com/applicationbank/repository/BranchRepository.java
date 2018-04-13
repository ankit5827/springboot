package com.applicationbank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.Manager;

@Repository
public interface BranchRepository  extends CrudRepository<Branch, Integer>{
	
	
	List<Branch> findByBank(Bank bank);
	List<Branch> findByManager(Manager manager);

}
