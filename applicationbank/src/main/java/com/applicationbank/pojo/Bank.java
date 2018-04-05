package com.applicationbank.pojo;

import java.util.Set;

import javax.persistence.*;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="bank")
public class Bank {
	@Id
	@Expose
	private Integer bankid;
	@OneToMany(mappedBy="bank")
	private Set<Branch> branch;
	@Expose
	private String bankname;

	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public Bank(Integer id) {
		this.bankid = id;
	}
	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public Set<Branch> getBranch() {
		return branch;
	}

	public void setBranch(Set<Branch> branch) {
		this.branch = branch;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	
	
	

}
