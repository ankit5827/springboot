package com.database.demo.pojo;

import javax.persistence.*;

@Entity
@Table(name="loanapplication")
public class LoanApplication {
	@Id
	private Long loanapplicationid;
	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customer;
	public Long getLoanapplicationid() {
		return loanapplicationid;
	}
	public void setLoanapplicationid(Long loanapplicationid) {
		this.loanapplicationid = loanapplicationid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
