package com.absassignment;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee type (Developer, TeamLeader, Manager)");
		
		String empRole = scanner.nextLine();
		
		switch (empRole.toLowerCase()) {
		case "manager":
			System.out.println("=============Manager=============");
			Employee employee = new Manager("Srikanth",10303, "Trichy",80000.00);
			employee.calcBonus(80000);
			employee.printEmpDetails();
			Employee.projectDetails();
			employee.salaryProcess();
			Manager manager = (Manager) employee; //Employee class reference object down casted
			String[] trainingDetails = manager.trainingDetails();
			for(String details:trainingDetails) {
				System.out.println("Training Details: "+ details);
			}
			
			break;
			
		case "teamleader":
			System.out.println("=============Team Lead=============");
			Employee employee1 = new Developer("Praveen", 10256, "Hyd", 60000.00, "JAVA Proj1");
			employee1.calcBonus(60000);
			
			TeamLeader teamlead = (TeamLeader) employee1;
			teamlead.printDetailsTL();
			Employee.projectDetails();
			teamlead.salaryProcess();
			
		case "developer":
			System.out.println("=============Team Lead=============");
			Employee employee2 = new Developer("Siva", 10203, "Hyd", 40000.00, "JAVA Proj2");
			employee2.calcBonus(40000);
			employee2.printEmpDetails();
			employee2.salaryProcess();
			Employee.projectDetails();
			
			Developer dev = (Developer) employee2;
			String[] hobbylist = dev.showHobbies();
			
			for(String hblst: hobbylist) {
				System.out.println("Hobby is: "+hblst);
			}

		default:
			//System.out.println("*****Invalid input*****");
			scanner.close();
			System.exit(0);
			break;
		}

	}

}
