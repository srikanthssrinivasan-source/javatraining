package com.training.arrays;

public class PatternDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 4;
		int counter = 1;
		
		for(int i = 1; i <= n1; i++) {
			for(int j = 1;j <= i; j++) {
				if (counter <= 9) {
				System.out.print(counter);
				counter ++;
				}
			}
			if (i < n1) {
                System.out.print(" ");
			}
		}	
	}

}
