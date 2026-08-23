package com.training.arrays;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {5,4,6,7,4,8,5,4};
		
		int i =0;

		Arrays.sort(arr);
		
		while(i<arr.length) {
			
			int current = arr[i];
			int cnt = 1;
			
			while(i+1 < arr.length && arr[i+1] == current) {
				cnt++;
				i++;				
			}
			
			if(cnt>1) {
				System.out.println(current + " occured " + cnt+ " times.");
			}
			i++;
		}
		
	}

}
