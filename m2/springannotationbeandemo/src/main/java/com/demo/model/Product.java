package com.demo.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Product implements Serializable{
	private int productId;
	private String productName;
	private long cost;
	private String catagory;
	
	public Product() {
		super();
	}
	
	public Product(int productId, String productName, long cost, String catagory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.catagory = catagory;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + ", catagory="
				+ catagory + "]";
	}
	
}
