package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Customer;
import com.demo.model.Product;

public class ProductData {
	public static void main(String[] args) {
		//p1,c1
		// ac context reference
		ApplicationContext ac=new  ClassPathXmlApplicationContext("spring-bean-configuration.xml");
		Product pro=ac.getBean(Product.class);
		Customer cust=ac.getBean(Customer.class);
		System.out.println(pro);
		System.out.println(cust);
	}
}
