package com.applicationbank.pojo;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="manager")
public class Manager {
	@Id
	private Integer managerid;
	@OneToMany(mappedBy="manager")
	private Set <Customer> customer;
	@OneToOne 
	@JoinColumn(name="branchid")
	private Branch branch;
	
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private String gender;
	private Date birthdate;
	private String password;
	private Long mobileno;
	
	public Integer getManagerid() {
		return managerid;
	}
	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	
	
	
	
	 
	
	
	
	public Manager() {
		
	}
	public Manager(Integer managerid) {
		super();
		this.managerid = managerid;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Manager [managerid=" + managerid + ", customer=" + customer + ", branch=" + branch + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", gender="
				+ gender + ", birthdate=" + birthdate + ", password=" + password + ", mobileno=" + mobileno + "]";
	}
	
	

}
