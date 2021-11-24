package com.bms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bms.dao.BankDao;
import com.bms.model.Bank;

public class BankService {
	public Bank createBank(Bank bank) {
		BankDao bankDao=new BankDao();
		Bank answer = bankDao.createBank(bank);
		return answer;
	}
	public List<Bank> getAllBanks(){
		BankDao bankDao=new BankDao();
		return bankDao.getAllBanks();
	}
}
