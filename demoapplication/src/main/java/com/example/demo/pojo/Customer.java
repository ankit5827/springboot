package com.example.demo.pojo;
import java.util.*;

import javax.persistence.*;
@Entity
@Table
public class Customer {
	
	
	private int customerid;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String address;
	private long mobileno;
	private String date;
	private String gender;
	private List <LoanApplication> loanapplicationi;
	
	
	
	
	@Id
	public int getCustomer_id() {
		return customerid;
	}
	
	public void setCustomer_id(int customer_id) {
		this.customerid = customer_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public long getMobileno() {
		return mobileno;
	}
	
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@OneToMany(mappedBy="customer")
	public List<LoanApplication> getLoanapplicationi() {
		return loanapplicationi;
	}
	
	public void setLoanapplicationi(List<LoanApplication> loanapplicationi) {
		this.loanapplicationi = loanapplicationi;
	}

	
	
	

}
