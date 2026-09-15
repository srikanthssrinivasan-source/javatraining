package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.showBooks();
		return books;
	}

	@Override
	public Book getById(int bookId) {
		List<Book> books = BookDetails.showBooks();		
		for(Book book:books) {	
			if(book.getBookId() == bookId) {
				return book;
			}
		}
		throw new BookNotFoundException("Invalid ID. Book is not found");
	}

	@Override
	public List<Book> getByTitleContents(String title) {
		List<Book> books = BookDetails.showBooks();		
		//create temporary array
		List<Book> booksByTitle = new ArrayList<>();
		
		for(Book book:books) {	
			if(book.getTitle().contains(title)) {				
				booksByTitle.add(book);
			}
		}
		if(booksByTitle.isEmpty()) {		
		throw new BookNotFoundException("Book doesn't exist with this title");
		}
		return booksByTitle;
	}
	

	@Override
	public List<Book> getByAuthCategory(String author, String category) {
		List<Book> books = BookDetails.showBooks();		
		//create temporary array
		List<Book> booksByAuthCategory = new ArrayList<>();
		
		for(Book book:books) {	
			if(book.getAuthor().contains(author) && book.getCategory().contains(category)) {				
				booksByAuthCategory.add(book);
			}
		}
		if(booksByAuthCategory.isEmpty()) {		
		throw new BookNotFoundException("Book doesn't exist with this author and category");
		}
		return booksByAuthCategory;
	}

	@Override
	public List<Book> getByLesserPrice(double price) {
		List<Book> books=BookDetails.showBooks();
		List<Book> lowPriceBookList= new ArrayList<Book>();
		  for(Book book:books) {
		   if(book.getPrice() < price) {
		    lowPriceBookList.add(book);
		   }
		  }
		if(lowPriceBookList.isEmpty()) {
		   throw new BookNotFoundException("Books not found with that much lower price:: "+price);
		  }
		return lowPriceBookList;
	}
}
