package com.bms.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.util.SystemPropertyUtils;
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
	@RequestMapping(value = "/bank",method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE) 
	public Bank createBank(@RequestBody Bank bank) {
		BankService bankService=new BankService();
		Bank result=bankService.createBank(bank);
		return result;
	}
	// get a bank resource bank id , Pathvariable, QueryParam, RequestBody
	// Get /bank/6000
	@RequestMapping(value = "/bank/{bankId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Bank getBankById(@PathVariable("bankId") int bId) {
		BankService bankService=new BankService();
		return bankService.getBankById(bId);
	}
	
	// get all bank resource
	@RequestMapping(value = "/bank",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bank> getAllBanks(){
		BankService bankService=new BankService();
		return bankService.getAllBanks();
	}
	
	// update bank resource by bank id
	@RequestMapping(value = "/bank", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Bank updateBank(@RequestBody Bank bank) {
		BankService bankService=new BankService();
		Bank result = bankService.getBankById(bank.getBankId());
		if(result!=null) {
			return bankService.updateBank(bank);
		}
		System.out.println("bank details with the bank ID "+bank.getBankId()+" doest not exists");
		return result;
	}
	
	// delete a bank resource by bank id
	@RequestMapping(value = "/bank/{bankId}", method = RequestMethod.DELETE)
	public String deleteBankById(@PathVariable("bankId") int bId) {
		BankService bankService=new BankService();
		Bank result = bankService.getBankById(bId);
		
		if(result!=null) {
			System.out.println("Bank details with the bank Id: "+bId+" found delete started");
			bankService.deleteBank(result);
			return "Bank details with the bank Id: "+bId+" deleted sucessfully";
		}
		return "Bank details with the bank Id: "+bId+"not found deletion failure";
		
	}
}
