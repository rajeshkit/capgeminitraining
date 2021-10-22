package com.upipayment.gateway;

public class PaymentHistory {
	public void getHistory() {
		PaymentGateway pg=new PaymentGateway();
		System.out.println(pg.name);
		pg.display();
	}
}
