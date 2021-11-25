package com.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bms.model.Bank;
import com.bms.service.BankService;

@RestController
public class BankController {
	@Autowired
	private BankService bankService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "Welcome first Spring boot project";
	}
	
	@RequestMapping(value="/bank", method=RequestMethod.POST )
	public Bank createBank(@RequestBody Bank bank) {
		return bankService.createBank(bank);
		
	}
}
