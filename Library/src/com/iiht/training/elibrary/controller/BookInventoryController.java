package com.iiht.training.elibrary.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iiht.training.elibrary.exception.BookAlreadyIssuedException;
import com.iiht.training.elibrary.exception.ISBNAlreadyExistsException;
import com.iiht.training.elibrary.exception.ISBNDoesNotExistsException;
import com.iiht.training.elibrary.inventory.BookInventory;
import com.iiht.training.elibrary.model.Book;
import com.iiht.training.elibrary.model.BookIssue;

public class BookInventoryController {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		List<Book> l=new ArrayList<>();
		List<BookIssue> is=new ArrayList<>();
		
		try
		{
			BookInventory.addBooks(l,n);
		}
		catch(ISBNAlreadyExistsException e)
		{
			System.out.println(e);
		}
		
		
		try
		{
			BookInventory.issueBooks(l,is);
		}
		catch(ISBNDoesNotExistsException e)
		{
			System.out.println(e);
		}
		catch(BookAlreadyIssuedException e)
		{
			System.out.println(e);
		}
		
		
		
		
	}
	
	

}
