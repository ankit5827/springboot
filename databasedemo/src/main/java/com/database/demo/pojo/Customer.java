package com.database.demo.pojo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	private Long customerid;
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	
	private Set<LoanApplication> loanapplication;

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
	

}
