package com.applicationbank.pojo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="bank")
public class Bank {
	@Id
	@Expose
	private Long bankid;
	@OneToMany(mappedBy="bank")
	private Set<Branch> branch;
	@Expose
	private String bankname;

	public Long getBankid() {
		return bankid;
	}

	public void setBankid(Long bankid) {
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
