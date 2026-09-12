package com.productapp.main;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Customer {

	public static void main(String[] args){


		//interface name = implementation class
		IProductService productService = new ProductServiceImpl();
		
		Product[] products = productService.getAllProducts() ;
		System.out.println("Printing all Products");
		System.out.println();
		for(Product nproduct:products) {
			System.out.println(nproduct);
		}
		System.out.println();
		System.out.println("Product by Brand");
		System.out.println();
		
		try {
			products= productService.getByBrand("Samsung");
			for(Product nproduct:products) {
				System.out.println(nproduct);
			}			
		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Product by ID");
		System.out.println();
		Product productById = null;
		
		try {
			productById = productService.getById(1);
			System.out.println(productById);
		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
