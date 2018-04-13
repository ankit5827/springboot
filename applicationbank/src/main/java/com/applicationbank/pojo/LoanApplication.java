package com.applicationbank.pojo;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="loanapplication")
public class LoanApplication {
	@Id
	@GeneratedValue
	private Integer loanapplicationid;
		
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="customerid")
	private Customer customer;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="loantypeid")
	private LoanType loantype;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="branchid")
	private Branch branch;
	
	
	 
	private Double loanamount;
	private Double annualincome;
	private Long duration;
	@Column(columnDefinition="varchar(255)  default ' Pending' ")
	private String status;

	public LoanApplication() { 
		super();
	}
	public Integer getLoanapplicationid() {
		return loanapplicationid;
	}
	public void setLoanapplicationid(Integer loanapplicationid) {
		this.loanapplicationid = loanapplicationid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(Double loanamount) {
		this.loanamount = loanamount;
	}
	public Double getAnnualincome() {
		return annualincome;
	}
	public void setAnnualincome(Double annualincome) {
		this.annualincome = annualincome;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public LoanType getLoantype() {
		return loantype;
	}
	public void setLoantype(LoanType loantype) {
		this.loantype = loantype;
	}
	
	
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LoanApplication [loanapplicationid=" + loanapplicationid + ", loanamount=" + loanamount + ", annualincome=" + annualincome + ", duration=" + duration
				+ ", status=" + status + "]";
	}
	
		
	
	
	
	

}
