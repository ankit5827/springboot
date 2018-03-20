/*package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
	@Id
	@Column(name="loanid")
	@GeneratedValue
	private int loanid;
	private String loantype;
	private float intrestrate;
	private int branchid;
	
	public int getLoanid() {
		return loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public float getIntrestrate() {
		return intrestrate;
	}
	@ManyToOne
	public int getBranchid() {
		return branchid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public void setIntrestrate(float intrestrate) {
		this.intrestrate = intrestrate;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	
	

}
*/