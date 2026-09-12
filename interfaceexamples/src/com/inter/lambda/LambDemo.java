package com.inter.lambda;

public class LambDemo {

	public static void main(String[] args) {

		//IShape shape = new IMPLEMENTING CLASS(); //This is traditional method
		

		//use lambda - provide the implementation
		IShape shape1 = (x,y)->{
			System.out.println("Square: " + x*y);
		};
		
		shape1.area(10, 10);
		
		IShape shape2 = (x,y)->{
			System.out.println("Rectangle: " + x*y);			
		};
		shape2.area(15, 17);
		
		
		
		IMessenger messenger = msg->{
			return "Hello "+msg;
			};
			
			String result = messenger.greet("Priya");
			System.out.println(result);
			
			messenger = msg->"Have a great day"+msg;
			System.out.println(messenger.greet("Priya"));
			

	}

}
