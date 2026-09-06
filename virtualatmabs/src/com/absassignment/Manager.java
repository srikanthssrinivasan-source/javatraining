package com.absassignment;

public class Manager extends Employee {
		//double salary;

		public Manager(String empName, int empID, String empCity, double salary) {
			super(empName,empID, empCity, salary);
			//this.salary = salary;
		}

		@Override
		void calcBonus(int bonus) {
			int calcbBonus = bonus* 2;
			System.out.println("Calculated bonus for Manager is: " + calcbBonus);			
		}
		
		public String[] trainingDetails() {
			return new String[] {"DotNet","AI","ML","JAVA"};
		}
		
		
}
