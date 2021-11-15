package com.tms.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tms.entity.Customer;
import com.tms.entity.Loan;

public class BankManagement {
	public static void main(String[] args) {
		Customer c1=new Customer(0, "rajesh", "chennai");//new or transient state
		Customer c2=new Customer(0, "thirupathi", "ap");//new or transient state
		Customer c3=new Customer(0, "sharma", "pune");//new or transient state
		
		Loan l1=new Loan(0, "Personal", 50000);//new or transient state
		Loan l2=new Loan(0, "Vechile", 10000);//new or transient state
		Loan l3=new Loan(0, "Home", 100000);//new or transient state
		
		l1.setCustomer(c2);
		l2.setCustomer(c3);
		l3.setCustomer(c1);
	
		c1.setLoan(l3);
		c2.setLoan(l1);
		c3.setLoan(l2);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("bankunit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(l1);
		em.persist(l2);
		em.persist(l3);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
