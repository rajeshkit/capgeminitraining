package com.tms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private String branchName;
	@OneToOne
	private Loan loan; // it creates a foreign key columan loan_loanid of loan table loanid primary key
	
	public Customer(int customerId, String customerName, String branchName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.branchName = branchName;
	}
	
	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", branchName=" + branchName
				+ "]";
	}
	
}
