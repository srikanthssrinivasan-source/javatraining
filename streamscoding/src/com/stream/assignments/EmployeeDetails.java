package com.stream.assignments;

import java.util.Arrays;
import java.util.List;

public class EmployeeDetails {

	
		public static List<Employee> getAllEmployees(){
			//10 emp, 4 emp with same city, 3 emp with same dep
			return Arrays.asList(
					new Employee("Vijith",100,50000,"Trichy","Admin"),
					new Employee("Srikanth",101,15000,"Trichy","DBA"),
					new Employee("Ganesh",102,55000,"Trichy","IT"),
					new Employee("Roopa",103,45000,"Trichy","Finance"),
					new Employee("Kumar",104,12000,"Trichy","Sales"),
					new Employee("Vaishali",105,15000,"Bangalore","Finance"),
					new Employee("Rathina",106,51000,"Bangalore","Admin"),
					new Employee("James",107,15000,"Bangalore","DBA"),
					new Employee("Dharshini",108,15000,"Bangalore","DBA"),
					new Employee("Hemanth",109,55000,"Bangalore","IT")	
					);
					
					
		}

}

