package com.absassignment;

public abstract class TeamLeader extends Employee {
		String projName;

		public TeamLeader(String empName, int empID, String empCity, double salary, String projName) {
			super(empName, empID, empCity, salary);
			this.projName = projName;
		}
		
		void printDetailsTL() {
			System.out.println("============Team Leader Details============");
			System.out.println("Employee Name: "+empName);
			System.out.println("Employee ID: " + empID);
			System.out.println("Employee City: "+empCity);
			System.out.println("Employee Salary: "+empSalary); //empSalary is from Employee Class
			System.out.println("Project Name: "+projName);
			System.out.println("Company Name: "+COMPANYNAME); //COMPANYNAME is from Employee class
		}
		
}
