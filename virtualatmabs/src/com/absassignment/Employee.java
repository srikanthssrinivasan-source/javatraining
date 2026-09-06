package com.absassignment;

public abstract class Employee {
		static final String COMPANYNAME = "Hansa";
		String empName;
		int empID;
		String empCity;
		double empSalary;
		
		public Employee(String empName, int empID, String empCity, double inpsal) {
			super();
			this.empName = empName;
			this.empID = empID;
			this.empCity = empCity;
			this.empSalary = inpsal;
		}
		
		void printEmpDetails() {
			System.out.println("=========Employee Details as below from Employee Class=========");
			System.out.println("Employee Name: " + empName);
			System.out.println("Employee ID: " + empID);
			System.out.println("Employee City: " + empCity);
			System.out.println("Employee Company: " + COMPANYNAME);
		}
		
		abstract void calcBonus(int bonus);
		
		static void projectDetails() {
			System.out.println("Project developed in JAVA!!!");
		}
		
		final void salaryProcess() {
			double sal = empSalary*3;
			System.out.println("Employee Salary: " + sal);
		}
		
		
}
