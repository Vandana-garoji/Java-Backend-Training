package com.ftd;
import java.io.*;

class NullValueException extends RuntimeException
{
	public NullValueException(String s)
	{
		super(s);
	}
	
	
}
class InvalidOperatorException extends RuntimeException
{
	public InvalidOperatorException(String s) {
		super(s);
		
	}
	
}


class Activity
{
	String string1;
	String string2;
	String operator;

	Activity(String string1,String string2 ,String operator)
	{ 
		this.string1=string1;
		this.string2=string2;
		this.operator=operator;		
	}
	
}
class Source
{
	
	 String handleException (Activity i) throws NullValueException, InvalidOperatorException
	 {      int check=0;
		
			if((i.string1 == "" )|| (i.string2 == "")  )
			
			 {
				 //return null values found exception
				 check=1;
				 throw new NullValueException("Null values Found");
				 
			 }
		     if(!(( i.operator == "+") || (i.operator == "-")))
		     { 
		    	 // return operator exception
		    	 check=1;
		    	 throw new InvalidOperatorException("Invalid Operator Found");
		    	 
		    	 
		     }
	 
			 
		 
		   return " ";
	}
		 
		
		 

	 public String doOperation(Activity a)
	 {  
		  
	      String result=" ";
	      
		 switch(a.operator)
	 {
		 case "+" :
		 {
			result=a.string1+a.string2;
		 }
		 break;
		 case "-" :
		 {   
			 
			 result=a.string1.replace(a.string2," ");
		 }
		 break;
		 default:
			 System.out.println("Invalid operator");
		
		 
	 }
		 //System.out.println(result);
		 return result;
	 

   }
	 
	 
	 
	 
	 
	 static void TestCases() 
	 {
		 Source s=new Source();
		
		
        try
        {
		 Activity b=new Activity("hello world","world","+");
		 s.handleException(b);
		 System.out.println(s.doOperation(b));
		 
        }
        catch(InvalidOperatorException e)
        {
        	System.out.println(e);
        	
        }
        catch(NullValueException e)
        {
        	System.out.println(e);
        	
        }
        try
        {
		 Activity c=new Activity("hello world","world","*");
		 s.handleException(c);
		 System.out.println(s.doOperation(c));
		 
        }
        catch(InvalidOperatorException e)
        {
        	System.out.println(e);
        }
        catch(NullValueException e)
        {
        	System.out.println(e);
        	
        }
        try
        {
		 Activity d=new Activity("","","*");
		 s.handleException(d);
		 System.out.println(s.doOperation(d));
		 
        }
        catch(InvalidOperatorException e)
        {
        	System.out.println(e);
        	
        }
        catch(NullValueException e)
        {
        	System.out.println(e);
        	
        }
       

		
	}
}

public class SupriseTest 
{
	
	public static void main(String[] args)
	{
		
		
		Activity a=new Activity("hello world","world","-");
		Source s=new Source();
		s.handleException(a);				
		s.doOperation(a);
		System.out.println(s.doOperation(a));
		s.TestCases();
		
	}

	
	
	

}
