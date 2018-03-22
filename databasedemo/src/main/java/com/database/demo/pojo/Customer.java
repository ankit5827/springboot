package com.database.demo.pojo;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	private Long customerid;
	
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	
	private Set<LoanApplication> loanapplication;
	
	@ManyToOne
	@JoinColumn(name="managerid")
	private Manager manager;
	
	private String firstname;
	private String lastname;
	private Long mobileno;
	private String email;
	private String password;
	private String address;
	private Date birthdate;
	private String gender;

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public Set<LoanApplication> getLoanapplication() {
		return loanapplication;
	}

	public void setLoanapplication(Set<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	
	

}
