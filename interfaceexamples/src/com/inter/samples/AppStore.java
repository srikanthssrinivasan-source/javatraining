package com.inter.samples;

public class AppStore {

	public static void main(String[] args) {

		IPaymentProcessor paymentprocessor = new UpiPayment();
		paymentprocessor.payAmount(1000);
		paymentprocessor.checkOffers();// overridden default method
		
		IPaymentProcessor.printReceipt(1000);
		
		System.out.println(IPaymentProcessor.message);//call static variable
		
		//own method of UpiPayment
		
		UpiPayment upipayment =  (UpiPayment) paymentprocessor; //down casting
		
		upipayment.checkOffers();
		System.out.println();
		
		//card payment
		//we can use same variable "paymentprocessor"
		paymentprocessor = new CreditCardPayment();
		paymentprocessor.checkOffers(); //calls from interface
		
		CreditCardPayment credit = (CreditCardPayment) paymentprocessor; 
		// all methods in credit card 
		credit.cardLimit(20000);
		//super class method
		credit.cardType("VISA"); // from cardpayment class
		//call interface method
		credit.payAmount(4500); //from credicard payment class
		//default method
		credit.checkOffers(); // print from interface
		
		
		paymentprocessor = new DebitCardPayment();
		paymentprocessor.payAmount(3000);
		paymentprocessor.checkOffers(); //calls from debitcardpayment
		
		
		
		

	}

}
