package com.banking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.banking.model.Bank;

@RepositoryRestResource(path = "bankdetail")
public interface BankRepository extends CrudRepository<Bank, Integer>{
	@RestResource(path = "bankname")
	List<Bank> findByBankName(@Param("bankName")String bankName);
	List<Bank> findByBranchName(@Param("branchName")String branchName);
}

//http://localhost:9999/bankdetail/search/findByBranchName?branchName="chennai"