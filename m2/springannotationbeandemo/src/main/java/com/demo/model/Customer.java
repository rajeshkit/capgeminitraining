package com.demo.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Customer implements Serializable {
	private int customerId;
	private String customerName;
	private String address;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String customerName, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address + "]";
	}
	
}
