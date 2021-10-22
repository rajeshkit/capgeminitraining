package com.upipayment.gpay;

import com.upipayment.gateway.PaymentGateway;

public class GPay extends PaymentGateway{
	public void makePayment() {
		System.out.println(name);
		display();
		
	}
}
