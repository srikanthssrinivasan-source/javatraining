package com.training.arrays;

public class SmallSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[]{3,4,2,5};
		
		int smallest = arr[0];

	      for (int i=0; i < arr.length; i++){
	         if(arr[i] < smallest)
	            smallest = arr[i];
	      }

	     int secsmall = Integer.MAX_VALUE;

	     for (int i=0; i < arr.length; i++){
	         if(arr[i] != smallest && arr[i] < secsmall)
	        	 secsmall = arr[i];
	     }
	     
	     System.out.println("Second smallest is: " + secsmall);
	}

}
