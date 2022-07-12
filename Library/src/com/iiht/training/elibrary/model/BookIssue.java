package com.iiht.training.elibrary.model;

public class BookIssue {
	String name;
	 String author;
	 private int isbn;
	 int price;
	
	public BookIssue(int isbn , String name ,String author, int price)
	
	{
		
		this.isbn=isbn;
		this.name=name;
		this.author=author;
		this.price=price;
		
		
	}

	public int getIsbn() {
		// TODO Auto-generated method stub
		return isbn;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	
	

}
