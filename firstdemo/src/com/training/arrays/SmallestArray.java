package com.training.arrays;
import java.util.Arrays;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {5,10,6,3,45,30};
		
		
		//sort
		System.out.println("Array length: " + arr.length);
		System.out.println();
		
		Arrays.sort(arr);		
		
		System.out.println("Smallest is: " + arr[0] );
		
		//loop
		
		int small = arr[0];
		
		for(int i=1; i<= arr.length-1; i++) {
			if(arr[i]<small) {
				small = arr[i];
			}					
		}
		System.out.println();
		System.out.println("Smallest is: " +small);
	}

}
