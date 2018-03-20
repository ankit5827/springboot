/*package com.example.demo.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="branch")
public class Branch {
	@Id
	@Column(name="branchid")
	@GeneratedValue
	private int branchid;
	private String branchname;
	private String branchaddress;
	private String ifsccode;
	private int bankid;
	private Set<Loan> loans;
	private Set<Manager> managers;
	public int getBranchid() {
		return branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public String getBranchaddress() {
		return branchaddress;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	@ManyToOne
	@JoinColumn (name = "bankid  ")
	public int getBankid() {
		return bankid;
	}
	@ManyToOne
	public Set<Loan> getLoans() {
		return loans;
	}
	@ManyToOne
	@JoinColumn (name = "managerid")
	public Set<Manager> getManagers() {
		return managers;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public void setBranchaddress(String branchaddress) {
		this.branchaddress = branchaddress;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}
	public void setManagers(Set<Manager> managers) {
		this.managers = managers;
	}
	
	

}
*/