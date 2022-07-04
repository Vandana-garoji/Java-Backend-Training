package CustomException;
import java.util.*;



public class Main {
	public static void main(String[] args)
	{
	Boolean ch=true;
	int size=3;
    Employee e[] =new Employee[5];
    Scanner sc=new Scanner(System.in);
    
	while(ch)
	{
		
	System.out.println("select anything "+"\t1. initalize employee"+"\t2.Delete employee"+"\t3.update Employee"+"\t"
			+"\t 4.display employee"+"\t 5.Exit"+" \t 6.Addemplyee");
	
	 int n=sc.nextInt();
	
	switch( n)
	{
	
	
		
	case 1:
	{
		
	Employee e1= new Employee(1,"vandy",60000,"CSE","visakhapatnam");
	
	Employee e2= new Employee(2,"harry",60000,"CSE","visakhapatnam");
	Employee e3= new Employee(3,"mounica",60000,"CSE","kakinada");
	Employee e4= new Employee(4,"ramya",60000,"IT","kakinada");
	
	e[0]=e1;
	e[1]=e2;
	e[2]=e3;
	e[3]=e4;
	//e[4]=e5;
	
	}
	break;
	case 2:
		{   
			System.out.println("Enter the employee to be deleted");
			int eid=sc.nextInt();
			
			e[1].Deleteemployee(e,eid);
		}
		break;
	case 3:
	{
		System.out.println("Enter ID and new name of the employee to be updated");
		int id=sc.nextInt();
		String newname=sc.nextLine();
		e[1].Updateemployee(e,id,newname);
	
	}
	break;
	case 4:
	{
		e[1].Displayemployee(e,size);
	
	}
	break;
	case 5:
	{
		
		ch=false;
	}
	break;
	case 6:
	{   
	     System.out.println("enter eid");
	     int empid=sc.nextInt();
	     
	   // e[size-1].empid=empid;
	    
	    System.out.println("enter name");
	     String name=sc.next();
	     
	 //   e[size-1].name=name;
	    
	    
	    System.out.println("enter salary");
	     int salary=sc.nextInt();
	     
	  //  e[size-1].empid=empid;
	    System.out.println("enter dept");
	     String dept=sc.next();
	     
	  //  e[size-1].empid=empid;
	    System.out.println("enter location");
	     String location=sc.next();
	     
	  //1  e[size-1].empid=empid;
	   
	    size++;
		e[size]=new Employee(empid, name, salary,dept, location);
	}
	break;
	default: System.out.println("invalid");
		
	}
	}
	
	}

}
