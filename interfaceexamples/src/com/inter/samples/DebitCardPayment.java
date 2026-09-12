package com.inter.samples;

public class DebitCardPayment extends CardPayment{

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying through debit card of amount: " +amount);
		}
	
	public void checkOffers() {
		System.out.println("5% offer applicable for Debit card payment");
	}
}
