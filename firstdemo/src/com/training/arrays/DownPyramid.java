package com.training.arrays;

public class DownPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n2 = 5;
		System.out.println();
		for(int i = n2 ; i >= 1; i--) {
			for(int j = 1;j <= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}

}
