package com.inter.samples;

public class UpiPayment implements IPaymentProcessor {

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying the amount "+amount+" using UPI gateway");

	}

	@Override
	public void checkOffers() {
		
		//IPaymentProcessor.super.checkOffers();
		System.out.println("10% discount applicable for UPI Payment");
	}
	
	public void transactionStatus() {
		System.out.println("Checking status...");
	}

}
