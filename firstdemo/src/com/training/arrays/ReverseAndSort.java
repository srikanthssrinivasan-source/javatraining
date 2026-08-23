package com.training.arrays;

import java.util.Arrays;

public class ReverseAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		
		GetReversedNum(num);
		
		System.out.println();
		
		int[] arr = new int[] {1,2,3,4,5};
		
		for(int i=0; i< arr.length -1; i++) {
			int oppindex = arr.length - 1 - i;
			
			int temp = arr[i];
			arr[i] = arr[oppindex];
			arr[oppindex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		 int[] numbers = {5, 2, 8, 1, 9, 3};

	        Arrays.sort(numbers);
	        System.out.println("Sorted Array: " + Arrays.toString(numbers));		
	}
	
	public static void GetReversedNum(int n) {
		if(n==0) {
			return;
		}
		
		System.out.print(n%10);
		
		GetReversedNum(n/10);
	}

}
