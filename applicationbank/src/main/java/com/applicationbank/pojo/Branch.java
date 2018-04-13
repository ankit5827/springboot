package com.applicationbank.pojo;

import java.util.Set;

import javax.persistence.*;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="branch")
public class Branch {
	@Id
	@Expose
	private Integer branchid;
	@ManyToOne
	@JoinColumn(name="bankid")
	private Bank bank;
	@OneToMany(mappedBy="branch",fetch=FetchType.EAGER)
	private Set<LoanType> loantype;
	@OneToOne(mappedBy="branch")
	private Manager manager;
	
	
@OneToMany(mappedBy="branch",cascade = CascadeType.ALL)
	
	private Set<LoanApplication> loanapplication;
	
	
	@Expose
	private String branchname;
	private String branchaddress;
	private String ifsccode;
	public Branch(int id) {
		this.branchid=id;
	}
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	public Integer getBranchid() {
		return branchid;
	}
	
	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
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
	public Set<LoanType> getLoantype() {
		return loantype;
	}
	public void setLoantype(Set<LoanType> loantype) {
		this.loantype = loantype;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Branch [branchid=" + branchid + ", bank=" + bank + ", manager=" + manager + ", branchname=" + branchname
				+ ", branchaddress=" + branchaddress + ", ifsccode=" + ifsccode + "]";
	}
	
	


}
