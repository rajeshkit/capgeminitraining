package com.bms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.model.Bank;
import com.bms.repository.BankRepository;
@Service
public class BankService {
	@Autowired
	private BankRepository bankRepository;
	
	public Bank createBank(Bank bank) {
		return bankRepository.save(bank); // persist - javax.persistence API
											// save is from the hibernate org.hibernate		
	}
	public List<Bank> getAllBank(){
		return bankRepository.findAll();
	}
	
	public Optional<Bank> getBankDetailsById(int bankId) {
	
		return bankRepository.findById(bankId);
	}
	
	public void deleteBankDetailsById(int bankId) {
		bankRepository.deleteById(bankId);
	}
	public Bank updateBank(Bank bank) {
		return bankRepository.save(bank); // if the bsnkId already exists in the db merge									  // if the bankId is not there in db then persist
	}
	 
	public List<Bank> getAllBanksByName(String bankName){  // Query Generation
		return bankRepository.findByBankName(bankName);
	}
	
	public List<Bank> getAllBanksByBranchName(String branchName){  // Query Generation
		return bankRepository.findByBranchName(branchName);
	}
	public Bank getBankByNameAndBranch(String bName,String brName) {
		return bankRepository.findByBranchNameAndBankName(brName, bName);
	}
}
