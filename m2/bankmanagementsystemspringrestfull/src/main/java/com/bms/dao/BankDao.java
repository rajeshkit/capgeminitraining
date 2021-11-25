package com.bms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bms.model.Bank;
public class BankDao {
	public Bank createBank(Bank bank) {
		System.out.println(bank.getBankId()+" "+bank.getBankName()+" "+bank.getBranchName());
		//ORM code persist the bank object
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("bankunit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(bank);
		em.getTransaction().commit();
		return bank;
		
	}
	
	public List<Bank> getAllBanks(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("bankunit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("from Bank");
		List<Bank> list = query.getResultList();
		em.getTransaction().commit();
		return list;
	}
	
	public Bank getBankById(int bId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("bankunit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Bank b=em.find(Bank.class, bId);
		em.getTransaction().commit();
		return b;
		
	}
	
	public Bank updateBank(Bank bank) {
		// jpa orm code update bank
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("bankunit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Bank b = em.merge(bank);
		em.getTransaction().commit();
		return b;
	}
	public void deleteBank(Bank bank) {
		// jpa orm code update bank
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("bankunit");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Bank.class, bank.getBankId()));
		em.getTransaction().commit();
	}
}
