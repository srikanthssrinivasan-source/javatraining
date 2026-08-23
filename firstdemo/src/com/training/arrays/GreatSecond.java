package com.training.arrays;

public class GreatSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int []{3,4,2,5};
		
		int biggest = Integer.MIN_VALUE;
		int secbiggest = Integer.MIN_VALUE;
		
		for(int i:arr) {
			if(i>biggest) {
				secbiggest = biggest;
				biggest = i;
			} else if(i>secbiggest && i != biggest) {
				secbiggest = i;
			}
		}
		System.out.println("Second greatest is: " + secbiggest);
	}

}
