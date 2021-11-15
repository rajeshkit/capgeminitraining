package com.tms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Loan {
	@Id
	@GeneratedValue
	private int loanId;
	private String loanType;
	private int loanAmount;
	@OneToOne
	private Customer customer;
	
	public Loan(int loanId, String loanType, int loanAmount) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + "]";
	}
	
}
