package com.bookapp.client;

import java.util.Collections;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		
		System.out.println("Get all Books");
		
		List<Book> books = bookService.getAll();
		Collections.sort(books);
		
		for(Book book: books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("Book by ID");
		System.out.println();
		
		try {
			System.out.println(bookService.getById(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Get Books By Auth and category");
		System.out.println();
		try {
			List<Book> booksByAuth =  bookService.getByAuthCategory("Joe","Tech");
			Collections.sort(booksByAuth);
			for (Book book : booksByAuth) {
				System.out.println(book);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Get Books By Title containing");
		System.out.println();
		try {
			List<Book> booksByTitle =  bookService.getByTitleContents("Java");
			Collections.sort(booksByTitle);
			for (Book book : booksByTitle) {
				System.out.println(book);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		

	}

}
