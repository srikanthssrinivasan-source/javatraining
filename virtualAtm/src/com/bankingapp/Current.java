package com.bankingapp;

public class Current extends Account {
		String accountType;
		
		//public Current(double balance, String accountType) {
		//	super(balance);
		//	this.accountType = accountType;
		//}

		public Current(double balance, String accountType) {
			super(balance);
			this.accountType = accountType;
		}

		@Override
		void withdraw(double amount) {
			// TODO Auto-generated method stub
//			super.withdraw(amount);
			System.out.println("Withdraw from Current");
			balance = balance-amount-100;
		}

		@Override
		void deposit(double amount) {
			// TODO Auto-generated method stub
//			super.deposit(amount);
			System.out.println("Withdraw from Current");
			balance = balance+amount+50;
		}
		
		//own method of current class
		String[] showLoanTypes() {
			return new String[] {"short term", "long term","vehicle loan"};
		}
}
