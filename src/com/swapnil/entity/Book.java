package com.swapnil.entity;

public class Book {

	private String isbn;
	private String title;
    private String author;
    private String genre;
    
    
    
    public Book() {
		
	}
    
	public Book(String title, String author, String genre, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", isbn=" + isbn + "]";
	}
    
	
	
    
}
