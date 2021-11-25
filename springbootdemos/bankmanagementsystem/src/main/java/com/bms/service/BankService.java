package com.bms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.model.Bank;
import com.bms.repository.BankRepository;
@Service
public class BankService {
	@Autowired
	private BankRepository bankRepository;
	
	public Bank createBank(Bank bank) {
		return bankRepository.save(bank);
	}
	
}
