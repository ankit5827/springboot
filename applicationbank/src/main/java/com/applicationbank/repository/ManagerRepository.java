package com.applicationbank.repository;

import java.util.List;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.Manager;
import com.applicationbank.pojo.Branch;
import java.lang.Integer;
@Repository
public interface ManagerRepository extends CrudRepository<Manager, Integer>   {
	List<Manager> findByManageridAndPassword(Integer  managerid, String password);

	/*List<Manager>  findByBranch(Branch branch);*/
	
List<Manager> findByBranch(Branch branch);

List<Manager> findByManagerid(Integer managerid);
	
}
