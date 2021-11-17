package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Customer;
import com.demo.model.Product;

public class ProdutDetails {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
		Product pro = ac.getBean(Product.class);
		Customer cust = ac.getBean(Customer.class);
		Employee emp = ac.getBean(Employee.class);
		System.out.println(pro);
		System.out.println(cust);
		System.out.println(emp);
		
		
	}
}
