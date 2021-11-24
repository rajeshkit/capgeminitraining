package com.bms.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bms.model.Bank;
import com.bms.service.BankService;

@RestController // = @Controller + @ResponseBody
public class BankController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "welcome to bank controller";
	}
	// create a bank resource
	@RequestMapping(value = "/bank",method = RequestMethod.POST) 
	public Bank createBank(@RequestBody Bank bank) {
		BankService bankService=new BankService();
		Bank result=bankService.createBank(bank);
		return result;
	}
	// get a bank resource
	
	// get all bank resource
	@RequestMapping(value = "/bank",method = RequestMethod.GET)
	public List<Bank> getAllBanks(){
		BankService bankService=new BankService();
		return bankService.getAllBanks();
	}
	
	// update bank resource by bank id
	
	// delete a bank resource by bank id
}
