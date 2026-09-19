package com.streams.demos;

import java.util.List;
import java.util.Optional;

public class Example3 {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(20,54,33,91,11);
		
		//get the even numbers from the list
		System.out.println("Even");
		nums.stream()
				.filter(num->num%2==0) //will filter the true values
				.forEach(n->System.out.println(n));
		
		System.out.println();
		//get the first odd num from the list
		System.out.println("Odd");
		nums.stream()
		.filter(num->num%2!=0) //will filter the true values
		.forEach(n->System.out.println(n));
		
		System.out.println();
		
		//get the first odd num from the list
		System.out.println("First Odd Num");
		Optional<Integer> nOdd = nums.stream()
				.filter(num->num%2!=0) //will filter the true values
				.findFirst();
				
		if(nOdd != null)
			System.out.println(nOdd);
		
		//get each number multiplied by 2 and print the result
		System.out.println();
		System.out.println("Multiply by 2");
		
		nums.stream()
		.map(num->num*2) //will filter the true values
		.forEach(n->System.out.println(n));
		
		//get each number multiplied by 2 and print the result in ascending order
		
		System.out.println();
		System.out.println("Multiply by 2");
		nums.stream()
		.map(num->num*2) //will filter the true values
		.sorted()
		.forEach(n->System.out.println(n));
		
		//get each number multiplied by 2, sort them and print the first 3 result
		
		System.out.println();
		System.out.println("Multiply by 2 first 3 nums");
		nums.stream()
		.map(num->num*2) //will filter the true values
		.sorted()
		.limit(3)
		.forEach(n->System.out.println(n));


	}

}
