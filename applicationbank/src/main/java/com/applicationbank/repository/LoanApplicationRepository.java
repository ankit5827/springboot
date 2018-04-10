package com.applicationbank.repository;

import java.util.List;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.LoanApplication;

import java.lang.String;
@Repository
public interface LoanApplicationRepository extends CrudRepository<LoanApplication, Integer>   {
	
	List<LoanApplication> findByCustomer(Customer customer);
	
}
