package com.oops.basics;

public class Product {

	String[] showProducts() {
		String[] products = new String[] {"Laptop","Mouse","Keyboard"};
		return products;
		
		//return new String[]{"Laptop","Mouse","Keyboard"};
	}
	
	void printCategories(String[] categories) {
		
		for(String cat:categories) {
			System.out.println(cat);
		}
		
	}
	
	String offerDetails() {
		return "Offers are available";
	}
	
	public static void main(String[] args) {
		Product product = new Product();
		String offers = product.offerDetails();
		System.out.println(offers);
		
		String[] productList = product.showProducts();
		
		for(String prod : productList) {
			System.out.println(prod);
		}
		
		String[] categories = new String[] {"Electronics","Toys","Books"};
		product.printCategories(categories);
		
	}
}
