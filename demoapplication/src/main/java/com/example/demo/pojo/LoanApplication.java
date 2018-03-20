package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class LoanApplication {
	@Id
	private int loanapplicationid;
	private float loanamount;
	private float duration;
	private float annualincome;
	@ManyToOne
	private Customer customer;
	
	public int getLoanapplicationid() {
		return loanapplicationid;
	}
	
	public void setLoanapplicationid(int loanapplicationid) {
		this.loanapplicationid = loanapplicationid;
	}
	
	public float getLoanamount() {
		return loanamount;
	}
	
	public void setLoanamount(float loanamount) {
		this.loanamount = loanamount;
	}
	
	public float getDuration() {
		return duration;
	}
	
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public float getAnnualincome() {
		return annualincome;
	}
	
	public void setAnnualincome(float annualincome) {
		this.annualincome = annualincome;
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	

}
