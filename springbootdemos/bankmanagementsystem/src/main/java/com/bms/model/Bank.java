package com.bms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private int bankId;
	private String bankName;
	private String branchName;
	private String ifscCode;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankId, String bankName, String branchName, String ifscCode) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	

}
