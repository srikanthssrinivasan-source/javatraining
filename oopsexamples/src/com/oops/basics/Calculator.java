package com.oops.basics;

public class Calculator {

	int sum(int[] numbers) {

		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}

	int sumwithvarargs(String comment, int... numbers) {

		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}

	double square(int a) {

		// return a*a;
		return Math.pow(a, 2);
	}

}
