package com.absassignment;

public class Developer extends TeamLeader {
	
		
	public Developer(String empName, int empID, String empCity, double salary, String projName) {
		super(empName, empID, empCity, salary, projName);
	}
	
		@Override
		void calcBonus(int bonusAmount) {
			int bonAmt = (int) (bonusAmount*1.5);
			System.out.println("Calculated bonus for TL/Deveoper is: " + bonAmt);
		}
		
		public String[] showHobbies() {
			return new String[] {"Bowling","Cricket","Playing Piano"};
		}

}
