package com.streams.demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		//get the names containing r
		
		List<String> names = Arrays.asList("Raju","Manav","Gopi","Shaily","Rohan","Arun","Anu","Bhanu");
		
		/*//We can take the predicate as below commented part as well
		 * Predicate<String> pred = name->{ if(name.contains("r")) return true; return
		 * false; };
		 */
		
		/*// we can use like this as well
		 * Predicate<String> pred = name->name.contains("r");
		 * 
		 * List<String> newNames = names.stream() .filter(pred)
		 * .collect(Collectors.toList());
		 */
		
		List<String> newNames = names.stream() 
				.filter(str->str.startsWith("R"))
				  .collect(Collectors.toList());
		
		System.out.println(newNames);
		
		System.out.println();
		
		//get the first 5 names only, sort it and print directly
		
		names.stream()
			.limit(5)
			.sorted()
			.forEach(str->System.out.println(str.toUpperCase()));
		
		System.out.println();
		
		names.stream()		
		.sorted()
		.limit(5)
		.forEach(str->System.out.println(str.toUpperCase()));
		
		System.out.println();
		
		names.stream()		
		.sorted()
		.skip(5)
		.forEach(str->System.out.println(str.toUpperCase()));
		
		
		
		//get the names and convert to uppercase
		
		names.stream()
		.forEach(str->System.out.println(str.toUpperCase()));
		
		//or we can do as below
		System.out.println();
		System.out.println("With Map and Function");
		
		Function<String,String> fun = str->str.toUpperCase();
		
		names.stream()
		.map(fun) //or you can directly use .map(str->str.toUpperCase())
		.forEach(str->System.out.println(str));
		
		//input is string and output is length of each string value
		System.out.println();
		
		names.stream()
		.map(str->str.length())
		.forEach(num->System.out.println(num));
		
		
		//convert list to stream, filter by names having o, sort them and
		//add hello with each element and print them eg: Hello Manav
		System.out.println();
		names.stream()
		.filter(str-> str.contains("o")) //filter the elements
		.sorted()
		.map(str->"Hello "+str) //map will do the conversion.
		.forEach(str->System.out.println(str));
		
		
		
		
		
		

	}

}
