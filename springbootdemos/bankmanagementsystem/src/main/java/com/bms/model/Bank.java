package com.bms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name = "Bank.findByBankName",query = "select b from Bank b where b.bankName=?1")
@NamedQuery(name = "Bank.findByBranchName",query = "select b from Bank b where b.branchName=?1")
@NamedQuery(name = "Bank.findByBranchNameAndBankName",query = "select b from Bank b where b.branchName=?1 and b.bankName=?2")
public class Bank implements Serializable {
	@Id
	private int bankId;
	@NotBlank(message = "Bank Name cannot be null")
	private String bankName;
	@NotBlank(message = "Branch Name cannot be empty")
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
