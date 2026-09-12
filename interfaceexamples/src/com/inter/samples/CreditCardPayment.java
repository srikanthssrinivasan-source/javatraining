package com.inter.samples;

public class CreditCardPayment extends CardPayment{

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying through credit card of amount: " +amount);
		}
	
	void cardLimit(double amount) {
		System.out.println("Card limit is "+amount);
	}
}
