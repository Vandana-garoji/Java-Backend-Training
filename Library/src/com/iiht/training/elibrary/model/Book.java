package com.iiht.training.elibrary.model;

public class Book 
{
	 private String name;
	 private String author;
	 private int isbn;
	 private int price;

	public Book(int isbn , String name, String author , int price )
	{
		 this.setIsbn(isbn);
		 this.setName(name);
		 this.setAuthor(author);
		 this.setPrice(price);
		 
		 
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
