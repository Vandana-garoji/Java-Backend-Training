package CustomException;
import java.io.*;


import java.util.Scanner;
class NoSuchRecordException extends RuntimeException
{
	NoSuchRecordException(String s)
	{
		super(s);
	}
}
class RecordAlreadyExisted extends RuntimeException
{
	RecordAlreadyExisted(String s)
	{
		super(s);
	}
}




public class Organisation {
	String dept;
	String location;
	

}
class Employee extends Organisation

{
	
	
	
	
	int empid;
	String name;
	int salary;
	
	public Employee(int empid,String name,int salary,String dept,String location)
	
	{
		        this.empid=empid;
				this.name=name;
				this.salary=salary;
				this.dept=dept;
				this.location= location;
			
		
	}
	
	
	
	void Addemployee(int empid,String name,int salary,String dept,String location)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	    this.location= location;

		
		
	}
	
	void Deleteemployee(Employee e[],int id)
	{
		//
		for(int i=0;i< e.length-1;i++)
		{
			if(e[i].empid== id)
			{
				for(int j=i;j<e.length-1;j++)
				{
					e[j]=e[j+1];
				}
				break;
			}
			throw new NoSuchRecordException("please enter valis employee id that existed");
		
		}
		//e[e.length-1]=null;
	}
	
	void Displayemployee(Employee e[],int size)
	{
		//
	//	try {
		for(int i=0;i<= size;i++)
		{
			if(e[i].empid !=0) {
			System.out.print(e[i].empid+" ");
			System.out.print(e[i].name+" ");
			System.out.print(e[i].salary+" ");
			System.out.print(e[i].dept+" ");
			System.out.print(e[i].location+" ");
			}
		}
//		}
	/*	catch(Exception s1)
		{
			System.out.println("Displayed employees");
		}
		*/
	}
	void Updateemployee(Employee e[],int id,String newname)
	{		//
		for(int i=0;i< e.length;i++)
		{
			if(e[i].empid== id)
			{
				e[i].name=newname;
				
			}
			if(i>=e.length)
			{
				throw new NoSuchRecordException("please enter valis employee id that existed");
			}
		}
	}
	
}


