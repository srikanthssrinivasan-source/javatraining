package com.inter.samples;

public abstract class CardPayment implements IPaymentProcessor {

		void cardType(String type) {
			System.out.println("Card Type is "+ type);
		}

		
		
}
