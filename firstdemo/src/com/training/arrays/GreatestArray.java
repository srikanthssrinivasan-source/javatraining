package com.training.arrays;

import java.util.Arrays;

public class GreatestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {5,10,6,3,45,30};
		
		
		//sort
		System.out.println("Array length: " + arr.length);
		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.println("Greatest is: " + arr[arr.length-1] );
		
		//loop
		
		int great = 0;
		
		for(int i=1; i<= arr.length-1; i++) {
			if(arr[i]>great) {
				great = arr[i];
			}					
		}
		System.out.println();
		System.out.println("Greatest is: " +great);
	}

}
