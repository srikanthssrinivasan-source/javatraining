package com.stream.assignments;

import java.util.List;
import java.util.stream.Collectors;

public class EmpStreams {

	public static void main(String[] args) {
		
		//get all the employees
		
		List<Employee> employees = EmployeeDetails.getAllEmployees();
				
		
		//get the employees by city
		
		
		//create temp list. iterate thru the list. check if emp.getcity is equals 'Bangalore' and add to the list
		//return the list
		//or
		//using stream
		//convert list to a stream
		
		
		//by city
		employees.stream()
			.filter(emp->emp.getCity().equals("Bangalore"))
			.forEach(empstr->System.out.println(empstr));
		
		System.out.println();
		
		//by salary greater than 20000
		System.out.println("By Emp Salary > 20000");		
		
		List<String> empNamesbySal = employees.stream()
			.filter(emp->emp.getSalary()>20000)
			.map(emp->emp.getEmpName())	//output would be stream<String>
			.collect(Collectors.toList()); 	//collect is used for taking back the result as a List<returntype>
		
		System.out.println(empNamesbySal);
		
		System.out.println();
		System.out.println("Employee names in alphabetical order n sorted");
		
		employees.stream()
		.map(emp->emp.getEmpName().toUpperCase())	
		.sorted()
		.forEach(empstr->System.out.println(empstr));
		
		
		System.out.println();
		System.out.println("Employee names in reverse alphabetical order n sorted");
		
		employees.stream()
		.map(emp->emp.getEmpName().toUpperCase())	//output would be stream<String>
		.sorted((str1,str2)->str2.compareTo(str1))	//use comparator
		.forEach(empstr->System.out.println(empstr));
		
		
		System.out.println();
		System.out.println("in alphabetical order");
		
		employees.stream()
			.sorted((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()))
			.forEach(emp->System.out.println(emp));
		
		System.out.println();
		System.out.println("Get the salary sorted in ascending order");
		
		employees.stream()
			.map(emp->emp.getSalary())
			.sorted()
			.forEach(sal->System.out.println(sal));
		
		System.out.println();
		System.out.println("Get the employees sort by salary in descending order");
		
		employees.stream()
		.sorted((e1,e2)->e1.getCity().compareTo(e2.getCity()))
				/* .sorted((e1,e2)->((Double)e1.getSalary()).compareTo(e2.getSalary())) */
		//.sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())) //gives in ascending order
		.sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())) //gives in descending order
		
		.forEach(emp->System.out.println(emp)); //emp is employee object
		
		
		//get by id 101 if not throw exception
		
		System.out.println("Get by id 101 and give exception if not found");
		
		Employee employee = employees.stream()
			.filter(emp->emp.getEmpId()==101)
			.findFirst()
			.orElseThrow(()-> new EmployeeNotFoundException("Employee with ID 101 not found"));
		System.out.println(employee.getEmpName());
		
		


	}

}
