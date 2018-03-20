/*package com.example.demo.pojo;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="bank")
public class Bank {
	@Id
	@Column(name="bankid")
	@GeneratedValue
	private int bankid;
	private String bankname;
	private Set<Branch> branches;
	
	public int getBankid() {
		return bankid;
	}
	
	public String getBankname() {
		return bankname;
	}
	@OneToMany(mappedBy="Branch",cascade=CascadeType.ALL)
	public Set<Branch> getBranches() {
		return branches;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}
	
	

}
*/