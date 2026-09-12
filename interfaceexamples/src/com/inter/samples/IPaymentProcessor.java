package com.inter.samples;

public interface IPaymentProcessor {
	
		String message="Payment Gateway";
	
		void payAmount(double amount);
		
		static void printReceipt(double amount) {
			System.out.println("Receipt for the amount paid: "+ amount);
		}
			
		//public default method can be overridden in subclasses
		default void checkOffers() {
			System.out.println("Offer applicable");
			
		}
		}
