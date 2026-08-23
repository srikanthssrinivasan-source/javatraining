package com.training.arrays;

public class FiboAndPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 100;
		int firstnum = 0;
		int secondnum = 1;
		
		System.out.println("Fibonacci series upto: " + max);
		
		while(firstnum <= max) {
			System.out.println(firstnum + " ");
			int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
		}
		
		System.out.println();
		
		
		
		//PRIME
		
		for (int i = 2; i <= 100; i++) {
            boolean isprime = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                	isprime = false; 
                    break;          
                }
            }

            if (isprime) {
                System.out.print(i + " ");
            }
        }
		
	}

}
