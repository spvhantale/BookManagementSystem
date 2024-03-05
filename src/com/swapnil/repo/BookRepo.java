package com.swapnil.repo;

import java.util.List;

import com.swapnil.entity.Book;
import com.swapnil.exception.BookException;

public interface BookRepo {
	public void addBook(Book book);
	public void updateBook(Book book);
	public String removeBook(String ISBN) throws BookException;
	public Book getBookByISBN(String ISBN) throws BookException;
	public List<Book> searchBooks(String query) throws BookException;
}
