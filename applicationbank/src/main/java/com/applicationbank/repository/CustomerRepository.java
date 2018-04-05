package com.applicationbank.repository;

import java.util.List;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Customer;
import java.lang.String;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>   {
	List<Customer> findAllByCustomeridAndPassword(Integer  customerid, String password);
	
	List<Customer> findByCustomeridAndPassword(Integer  customerid, String password);
	
}
