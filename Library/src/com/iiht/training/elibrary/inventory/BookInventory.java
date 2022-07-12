package com.iiht.training.elibrary.inventory;

import java.util.List;
import java.util.Scanner;

import com.iiht.training.elibrary.exception.BookAlreadyIssuedException;
import com.iiht.training.elibrary.exception.ISBNAlreadyExistsException;
import com.iiht.training.elibrary.exception.ISBNDoesNotExistsException;
import com.iiht.training.elibrary.model.Book;
import com.iiht.training.elibrary.model.BookIssue;

public class BookInventory {
	public static void addBooks(List<Book> l, int n)
	{
		Scanner sc=new Scanner(System.in);
		int isbn ;
		String name;
		String author ;
		int price;
		for(int i =0;i<n;i++)
		{
			
			System.out.println("Enter ISBN");
			 isbn=sc.nextInt();
			 for(Book l1:l)
			 {
				 if (l1.getIsbn()==isbn)
				 {
					 

					 throw new ISBNAlreadyExistsException("ISBN Already Existed");
					 				 }
			 }
			 
			 
			 System.out.println("Enter name");
		     name=sc.next();
		     System.out.println("Enter author");
		     author =sc.next();
		     System.out.println("Enter price");
		     price=sc.nextInt();
		     
		     l.add(new Book(isbn,name,author,price));
		     
		     
		}
		
		
	}
	public static void issueBooks(List<Book> l,List<BookIssue> is)
	{ 
		Scanner sc=new Scanner(System.in);
	    int isbn,flag = 0 ;
		
		System.out.println("Enter ISBN of book to be issued");
		 isbn=sc.nextInt();
		 
		 for(Book l1:l)
		 {
			 if (l1.getIsbn()==isbn)
			 {   flag=1;
				 l.remove(l1);
				 
				 is.add(new BookIssue(l1.getIsbn(),l1.getName(),l1.getAuthor(),l1.getPrice()) );
				 
				 //System.out.println(l1.getIsbn()+l1.getName()+l1.getAuthor()+l1.getPrice());
				 break;
			 }
		 }
		 
		 
		 
				 
		 if(flag==0)
		 {
			 throw new ISBNDoesNotExistsException("ISBN Does NOT Exists");
		 }
		 int issued=0;

		 for(BookIssue l1:is)
		 {
			 if (l1.getIsbn()==isbn)
			 {   issued=1;
				 
				 
				 is.add(new BookIssue(l1.getIsbn(),l1.getName(),l1.getAuthor(),l1.getPrice()) );
				 
				
				 break;
			 }
		 }
		 if(flag==0)
		 {
			 throw new BookAlreadyIssuedException("ISBN Does NOT Exists");
		 }
		 for(Book l1:l)
		 {
			 
				 
				 
				 System.out.println(l1.getIsbn()+l1.getName()+l1.getAuthor()+l1.getPrice());
				
			 
		 }
		 
		 
		 
		 
		 
	}

}
