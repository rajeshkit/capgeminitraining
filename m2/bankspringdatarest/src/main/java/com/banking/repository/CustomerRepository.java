package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.banking.model.Customer;
@RepositoryRestResource(path = "bankcustomer")
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
