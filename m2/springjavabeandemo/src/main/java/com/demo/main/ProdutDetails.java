package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.model.Customer;
import com.demo.model.Product;

public class ProdutDetails {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(BeanConfig.class);
		Customer cust =(Customer) ac.getBean("customer");
		System.out.println(cust);
		
		Product pro=(Product)ac.getBean("product");
		System.out.println(pro);
		
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		
	}
}
