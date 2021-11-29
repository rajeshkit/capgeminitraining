package com.banking.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bank implements Serializable{
	@Id
	@GeneratedValue
	private int bankId;
	private String bankName;
	private String branchName;
	private String ifscCode;
}
