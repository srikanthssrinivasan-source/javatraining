package com.bankingapp;

public abstract class Account {
		double balance;
		
		//constant
		static final String BANKNAME = "ABC Bank";
		static String idProof = "Aadhar Card";

		public Account(double balance) {
			super();
			this.balance = balance;
		}
		
		//must be overridden
		
		abstract void withdraw(double amount);
		
		abstract void deposit(double amount);
			
		double getbalance() {
			return balance;
		}
		
		final void printInfo() {
			LoanApproal();//can be called only in the same class
			System.out.println("Loan approved member details");
		}
		
		private void LoanApproal() {
			System.out.println("Loan Approval process");
		}
		
		  //static method
		static void documentsNeeded() {
			System.out.println("ID Proof: " + idProof);
			System.out.println("Address Proof needed");
		}
}
