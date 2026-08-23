package com.training.arrays;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		//int num = 6;
		int sum = 0;
		
		for(int i = 1;i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(sum == num){
			System.out.println(num + " is a perfect number");
		}else {
			System.out.println(num + " is not a perfect number");
	}
		scanner.close();

}
}