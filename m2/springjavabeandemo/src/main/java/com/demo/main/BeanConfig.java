package com.demo.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.model.Customer;
import com.demo.model.Product;

@Configuration
public class BeanConfig {
	@Bean
	public Product product() {
		return new Product();
	}
	@Bean
	public Customer customer() {
		return new Customer();
	}
	@Bean
	public Employee employee() {
		return new Employee();
	}
}
