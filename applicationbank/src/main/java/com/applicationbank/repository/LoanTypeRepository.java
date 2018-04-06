package com.applicationbank.repository;

import java.util.List;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.LoanType;

import java.lang.String;
@Repository
public interface LoanTypeRepository extends CrudRepository<LoanType, Integer>   {
	
	
	
	List<LoanType> findByBranch(Branch branch);
	
}
