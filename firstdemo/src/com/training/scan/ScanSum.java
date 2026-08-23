package com.training.scan;

import java.util.Scanner;

public class ScanSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int [] numbers = new int[size];
        int sum = 0;
        
        System.out.println("Enter "+size+ " integers:");
        for (int i=0; i<size;i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; 
        }
        
        double average = (double) sum/size;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        scanner.close();
	}

}
