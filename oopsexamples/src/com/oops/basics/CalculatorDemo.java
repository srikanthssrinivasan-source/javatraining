package com.oops.basics;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[2];

		Calculator calculator = new Calculator();
		System.out.println("Enter 2 numbers");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i+1) + ": ");
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Sum of 2 numbers is: " + calculator.sum(arr));
		
		System.out.println();
		double square = calculator.square(5);
		System.out.println(square);
	}

}
