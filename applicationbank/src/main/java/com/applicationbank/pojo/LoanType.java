package com.applicationbank.pojo;

import java.util.Set;

import javax.persistence.*;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="loantype")
public class LoanType {
	@Id
	@Expose
	private Integer loantypeid;
	@ManyToOne
	@JoinColumn(name="branchid")
	private Branch branch;
	
	@OneToMany(mappedBy="loantype")
	private Set <LoanApplication> loanapplication;
	
	
	@Expose
	private String loantypename;
	private Float intrestrate;
	public LoanType() {
		// TODO Auto-generated constructor stub
	}
	public LoanType(int id) {
		this.loantypeid=id;
	}
	public Integer getLoantypeid() {
		return loantypeid;
	}
	public void setLoantypeid(Integer loantypeid) {
		this.loantypeid = loantypeid;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getLoantypename() {
		return loantypename;
	}
	public void setLoantypename(String loantypename) {
		this.loantypename = loantypename;
	}
	public Float getIntrestrate() {
		return intrestrate;
	}
	public void setIntrestrate(Float intrestrate) {
		this.intrestrate = intrestrate;
	}
	public Set<LoanApplication> getLoanapplication() {
		return loanapplication;
	}
	public void setLoanapplication(Set<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}
	
	

}
