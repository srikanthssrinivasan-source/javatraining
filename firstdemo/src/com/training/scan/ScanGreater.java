package com.training.scan;
import java.util.Scanner;

public class ScanGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        
        int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        
        System.out.println("The greatest number is: " + greatest);
        
        sc.close();
	}

}
