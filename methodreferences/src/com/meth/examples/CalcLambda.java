package com.meth.examples;

public class CalcLambda{

	public static void main(String[] args) {
		
		
		//add
		ICalculator ref = (x,y)->System.out.println(x+y); //implementation
		ref.calculate(10, 20); //calling
		//sub
		
		ref = (x,y)->System.out.println(x-y);
		ref.calculate(20, 10);
		
		
		//multiply
		
		ref = (x,y)->System.out.println(x*y);
		ref.calculate(20, 10);
		
		
		IGreeter gref = str->{
			return "Hello"+str;
		};
		String str = gref.greetUser("Priya");
		System.out.println(str);
		
		gref = name->"Hello" + name;
		String newstr = gref.greetUser("Priya");
		System.out.println(newstr);
		
		

	}


	

}
