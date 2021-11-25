package com.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{

}
