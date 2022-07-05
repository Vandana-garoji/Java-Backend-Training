
import java.util.*;







class EmployeeManagement{
	public static void main(String[] args) throws CustomException
	
	
	{
		 Employeeservice employeeService = new EmployeeServiceImpl();
		 
		 
	
	Boolean ch=true;
	int size=0;
	
   // Employee e[] =new Employee[5];
	ArrayList<Employee> e=new ArrayList<Employee>();
 //Employeeservice emp=new Employeeservice();
    
  //  Employeeservice emp = new EmployeeserviceImpl();
  
    Scanner sc=new Scanner(System.in);
    
	
	while(ch)
	{
		
	System.out.println("\n \"Welcome to employee management System\""+"\n\n1. initalize employee"+"\n2.Delete employee"+"\n3.update Employee"+
			"\n4.display employee"+"\n5.Exit"+"\n6.Addemplyee"+"\n7.searchemployee"+"");
	
	 int n=sc.nextInt();
	
	switch( n)
	{
	
	
		
	case 1:
	{
		
	//Employee e1= new Employee(1,"vandy",60000,"CSE","visakhapatnam");
	
	
	//Employee e2= new Employee(2,"harry",60000,"CSE","visakhapatnam");
	
	//Employee e3= new Employee(3,"mounica",60000,"CSE","kakinada");
	
	//Employee e4= new Employee(4,"ramya",60000,"IT","kakinada");
		
	
		e.add(new Employee(1,"vandy",60000L,"CSE"));
	//e[0]=e1;
	//e[1]=e2;
	//e[2]=e3;
	//e[3]=e4;
	//e[4]=e5;
	
	}
	break;
	case 2:
		{   
			System.out.println("Enter the employee to be deleted");
			
			int eid=sc.nextInt();
			try {
				
			employeeService.Deleteemployee(e, eid);
			
		
			}
			catch(CustomException f)
			{
				System.out.println(f.getErrorMessage());
			}
		}
		break;
	case 3:
	{
		System.out.println("Enter ID  of the employee to be updated");
		int id=sc.nextInt();
		System.out.println(" new name of the employee to be updated");
		String newname=sc.next();
		try {
			employeeService.Updateemployee(e,id,newname);
		}
		
		catch(CustomException f)
		{
			System.out.println(f.getErrorMessage());
		}
	
	}
	break;
	case 4:
	{ 
		
		employeeService.Displayemployee(e);
	     
	
	}
	break;
	case 5:
	{
		
		ch=false;
	}
	break;
	case 6:
	{   
	  
		
		/*System.out.println("enter eid");
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
		*/
		
		
		
			    size++;
				employeeService.Addemployee(e);
				
			  
	}
	break;
	case 7:
	{
		 System.out.println("enter eid");
	     int empid=sc.nextInt();
	     try {
	    //	 employeeService.serchemployeebyid(size , e, empid);
	    	 
	    	 employeeService.serchemployeebyid( e, empid);
	     }
	     catch(CustomException f)
			{
				System.out.println(f.getErrorMessage());
			}
	     
		
	}
	default: System.out.println("invalid");
		
	}
	}
	
	}

}
