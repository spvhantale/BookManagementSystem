package com.swapnil.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.swapnil.entity.Book;
import com.swapnil.exception.BookException;
import com.swapnil.repo.BookRepo;

public class BookService implements BookRepo {
	private Map<String, Book> books = new HashMap<>();

	@Override
	public void addBook(Book book) {
		books.put(book.getIsbn(), book);
	}

	@Override
	public void updateBook(Book book) {
		books.put(book.getIsbn(), book);
	}

	@Override
	public String removeBook(String Isbn) throws BookException{
		
		Book book=books.get(Isbn);
		if(book==null) {
			throw new BookException("Enter correct isbn");
		}else {
			books.remove(Isbn);
			return "Successfully remove book";
		}
		
	}

	@Override
	public Book getBookByISBN(String Isbn) throws BookException{
		
		Book book=books.get(Isbn);
		if(book==null) {
			throw new BookException("Enter correct isbn");
		}
		return book;
	}

	@Override
	public List<Book> searchBooks(String query) throws BookException{
		List<Book> searchResults = new ArrayList<>();
		for (Book book : books.values()) {
			if (contains(book.getTitle(), query) || contains(book.getAuthor(), query)
					|| contains(book.getGenre(), query) || contains(book.getIsbn(), query)) {
				searchResults.add(book);
			}
		}
		if(searchResults.isEmpty()) {
			throw new BookException("Books is not available");
		}
		
		return searchResults;
	}

	private boolean contains(String source, String query) {
		return source.toLowerCase().contains(query.toLowerCase());
	}
}
