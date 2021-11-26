package com.bms.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	public Bank createBank(@Valid @RequestBody Bank bank) {
		return bankService.createBank(bank);
	}
	
	@RequestMapping(value="/bank", method=RequestMethod.GET )
	public List<Bank> getAllBanks() {
		return bankService.getAllBank(); // List<Bank>
	}
	
	@RequestMapping(value="/bank/{bankId}", method=RequestMethod.GET )
	public Bank getBankDetailsById(@PathVariable("bankId") int bId) {
		Optional<Bank> bank = bankService.getBankDetailsById(bId);
		return bank.get();
		
	}
	@RequestMapping(value="/bank/branchname/{branchName}/bankname/{bankName}", method=RequestMethod.GET )
	public Bank getBankDetailsByBankName(@PathVariable("bankName") String bankName,
			@PathVariable("branchName") String brName) {
		return bankService.getBankByNameAndBranch(bankName, brName);
		
	}
//	@RequestMapping(value="/bank/branchname/{branchName}", method=RequestMethod.GET )
//	public List<Bank> getBankDetailsByBranchName(@PathVariable("branchName") String brName) {
//		return bankService.getAllBanksByBranchName(brName);
//		
//	}
	@RequestMapping(value="/bank/branchname/{branchName}", method=RequestMethod.GET )
	public List<Bank> getBankDetailsByBranchName(@PathVariable("branchName") String brName) {
		return bankService.getAllBanksByBranchName(brName);
		
	}
	
	
	@RequestMapping(value="/bank", method=RequestMethod.PUT )
	public Bank updateBankDetails(@RequestBody Bank bank) {
		return bankService.updateBank(bank);	
	}
	@RequestMapping(value="/bank/{bankId}", method=RequestMethod.DELETE)
	public String deleteBankDetails(@PathVariable("bankId") int bId) {
		Optional<Bank> b = bankService.getBankDetailsById(bId);
		if(b.isPresent()) {
			bankService.deleteBankDetailsById(bId);
			return "The Bank Details deleted with the bank ID: "+bId;
		}
		
		return "The Bank Details Not deleted with the bank ID: "+bId;
		
	}
}
