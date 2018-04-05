package com.applicationbank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Bank;
@Repository
public interface BankRepository extends CrudRepository<Bank, Integer> {

}
