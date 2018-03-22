package com.database.demo.pojo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="branch")
public class Branch {
	@Id
	private Long Branchid;
	@ManyToOne
	@JoinColumn(name="bankid")
	private Bank bank;
	@OneToMany(mappedBy="branch",fetch=FetchType.EAGER)
	private Set<LoanType> loantype;
	@OneToOne(mappedBy="branch")
	private Manager manager;
	
	
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
	
	


}
