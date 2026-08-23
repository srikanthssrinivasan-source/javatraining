package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] existingnames = {"Sri"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name to register: ");
		
		String inputname = scanner.nextLine();
		
		boolean isdup = false;
		
		if (existingnames.length > 0) {
			for(String username:existingnames) {
				
				if(username.equalsIgnoreCase(inputname)) {
					isdup = true;
					break;
				}
				
			}
		}
		
		if(isdup) {
			System.out.println("Name is not unique");
		}else {
			System.out.println("You are registered");
		}
		
		scanner.close();
	}

}
