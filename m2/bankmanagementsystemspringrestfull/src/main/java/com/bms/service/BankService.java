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
	
	public Bank getBankById(int bId) {
		BankDao bankDao=new BankDao();
		return bankDao.getBankById(bId);
	}
	
	public Bank updateBank(Bank bank) {
		BankDao bankDao=new BankDao();
		return bankDao.updateBank(bank);
	}
	public void deleteBank(Bank bank) {
		BankDao bankDao=new BankDao();
		bankDao.deleteBank(bank);
	}
}
