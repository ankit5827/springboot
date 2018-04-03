package com.applicationbank.repository;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>   {
	
	
}
