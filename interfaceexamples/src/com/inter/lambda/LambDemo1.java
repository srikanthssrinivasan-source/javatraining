package com.inter.lambda;

public class LambDemo1 {	

	public static void main(String[] args) {
		/*
		 * String[] arr = new String[]{"Italian cuisine","Indian Cuisine"}; ICuisine
		 * cuisine = (String[] menu)->{
		 * 
		 * for(String me:menu) { System.out.println(me); } }; cuisine.print(arr);
		 */
		
		
		ICuisine cuisine1 = (String... items)->{
			
			for(String me:items) {
				System.out.println(me);
			}
		};
		cuisine1.printMenu("Roti");
		cuisine1.printMenu("Roti1","Idly","Sabji");

	}

}
