package com.bms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
public class BankController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome to bank controller";
	}
}
