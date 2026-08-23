package com.training.arrays;

public class FactorialArmstorng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
            result *= i;
        }
		
		System.out.println("Factorial of "+n+ " is: " +result);
		System.out.println();
		
		System.out.println(FindArmstrong(153));
		
	}
	
	public static boolean FindArmstrong(int n) {

		int temp = n;
		int sum = 0;
		int power = String.valueOf(n).length();
		
		while(temp > 0) {
			int digit = temp % 10;
			sum+= (int)Math.pow(digit, power);
			temp = temp/10;
		}
		
		boolean isarmstrong = (sum==n);
		
		return isarmstrong;
	}

}
