package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Customer;
import com.demo.model.Product;

public class ProdutDetails {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
		// line 8 it creates an application context IOC container ac
		
		// p1 bean object here
		Product pro=(Product)ac.getBean("p1");
		Customer cust = (Customer)ac.getBean("c1");
		System.out.println(pro);
		System.out.println(cust);
		
		Product pro1=ac.getBean(Product.class);
		Customer cust1 = ac.getBean(Customer.class);
		System.out.println(pro1);
		System.out.println(cust1);
		
		Product pro2=ac.getBean(Product.class,"c1");
		Customer cust2 =ac.getBean(Customer.class,"p1");
		System.out.println(pro2);
		System.out.println(cust2);
		
		Product pro3=ac.getBean("p1",Product.class);
		Customer cust3 = ac.getBean("c1",Customer.class);
		System.out.println(pro3);
		System.out.println(cust3);
	}
}
