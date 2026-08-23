package com.training.scan;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] intarr = new int[size];
        System.out.println("Enter "+size+" integers:");
        for (int i = 0; i < intarr.length; i++) {
        	intarr[i] = scanner.nextInt();
        }

        double[] rootarr = new double[size];

        for (int i = 0; i < intarr.length; i++) {
        	rootarr[i] = Math.sqrt(intarr[i]);
        }

        System.out.println("\nThe square roots are:");
        for (int i = 0; i < rootarr.length; i++) {
            System.out.printf("Square root of %d is: %.4f%n", intarr[i], rootarr[i]);
        }

        scanner.close();
	}

}
