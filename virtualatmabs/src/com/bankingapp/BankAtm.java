package com.bankingapp;

import java.util.Scanner;

public class BankAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(Account.BANKNAME); //call static final variable
		Account.documentsNeeded(); //call static method
		System.out.println(Account.idProof); //print static variable

		
		System.out.println("Choose \'s\' for savings and \'c\' for current");
		String choice = scanner.next();
		Account account = null;

		if (choice.equalsIgnoreCase("S")) {
			account = new Savings(20000);
		} else {
			account = new Current(10000, "Current");

			Current current = (Current) account; // we have to type cast when calling upper level class with lower level
													// class reference

			String[] loans = current.showLoanTypes();
			for (String loan : loans) {
				System.out.println(loan);
			}
		}
		
		account.printInfo();

		for (;;) {
			System.out.println("""
					Enter 1. Withdraw
					\n    2. Deposit
					\n    3. Balance
					\n    4. Exit
					""");
			int type = scanner.nextInt();

			switch (type) {
			case 1:
				System.out.println("Enter amount to withdraw: ");
				double amount = scanner.nextDouble();
				account.withdraw(amount);
				break;
			case 2:
				System.out.println("Enter amount to deposit: ");
				double amount1 = scanner.nextDouble();
				account.deposit(amount1);
				break;
			case 3:
				System.out.println("Balance is: " + account.getbalance());
				break;
			case 4:

			default:
				scanner.close();
				System.exit(0);
				break;
			}
		}

	}

}
