package com.database.demo.pojo;

import javax.persistence.*;

@Entity
@Table(name="branch")
public class Branch {
	@Id
	private Long Branchid;
	@ManyToOne
	@JoinColumn(name="bankid")
	private Bank bank;
	
	private String branchname;
	private String branchaddress;
	private String ifsccode;
	public Long getBranchid() {
		return Branchid;
	}
	public void setBranchid(Long branchid) {
		Branchid = branchid;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getBranchaddress() {
		return branchaddress;
	}
	public void setBranchaddress(String branchaddress) {
		this.branchaddress = branchaddress;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	


}
