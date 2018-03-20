package com.example.demo.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
	@Id
	@Column(name="managerid")
	@GeneratedValue
	private int managerid;
	private String firstname;
	private String lastname;
	private String birthdate;
	private String gender;
	private String email;
	private long mobileno;
	private int branchid;
	private int customerid;
	public int getManagerid() {
		return managerid;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public long getMobileno() {
		return mobileno;
	}
	@ManyToOne
	@JoinColumn (name="branchid")
	public int getBranchid() {
		return branchid;
	}
	
	@OneToMany (mappedBy="Customer",cascade=CascadeType.ALL)
	
	public int getCustomerid() {
		return customerid;
	}
	
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	

}
