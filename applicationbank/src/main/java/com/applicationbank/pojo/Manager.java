package com.applicationbank.pojo;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="manager")
public class Manager {
	@Id
	@GeneratedValue
	private Integer managerid;
	@OneToMany(mappedBy="manager" , fetch=FetchType.EAGER)
	private Set <Customer> customer;
	@OneToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name="branchid")
	private Branch branch;
	
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private String gender;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="dd.MM.yyyy hh:mm")
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Manager [managerid=" + managerid + ", customer=" + customer + ", branch=" + branch + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", gender="
				+ gender + ", birthdate=" + birthdate + ", password=" + password + ", mobileno=" + mobileno + "]";
	}
	
	

}
