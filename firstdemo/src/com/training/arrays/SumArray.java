package com.training.arrays;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		//System.out.println(nums.length);
		
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
		
		int sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			//int val = nums[i];
			//System.out.println(val);
			sum+=nums[i];			
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println();
		
		int total=0;
		
		for(int num:nums) {
			total+=num;
			
		}
		System.out.println(total);
		System.out.println();
		
		String [] names = new String[] {"Sri","Sow","Nivas"};
		
		for(String name:names) {
			System.out.println(name.toUpperCase());
		}
		
	}

}
