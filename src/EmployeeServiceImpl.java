
import java.util.*;


public  class EmployeeServiceImpl implements Employeeservice{

	
	/*public void init(Employee[] e) {
		// TODO Auto-generated method stub
		
	}*/

	
	public void Updateemployee(ArrayList<Employee> e, int id, String newname) throws CustomException {
		// TODO Auto-generated method stub
		
	//	for(int i=0;i< e.length;i++)
		int j=0;
		
		
			for(Employee e1:e)
		{  
			
			if(e1.getId()== id)
			{
				e1.setName(newname);
				j++;
				
				
			}
			
			
			
			}
			if(j==0)
			{
				throw new CustomException("please enter valid employee id that existed");
			}
	}

	
	public void Displayemployee(ArrayList<Employee> e) {
		// TODO Auto-generated method stub
		
		
		//for(int i=0;i<=size;i++)
		for(Employee e1:e)
		{
			if(e1.getId() !=0) {
			System.out.print(e1.getId()+" ");
			System.out.print(e1.getName()+" ");
			System.out.print(e1.getSalary()+" ");
			
			System.out.print(e1.getDesignation()+" ");
			}
		}
	}

	
	public void Deleteemployee(ArrayList<Employee> e, int id) throws CustomException {
		// TODO Auto-generated method stub
		
		//for(int i=0;i< e.length-1; i++)
		/*
		 
			
			
			if(e[i].getId()== id)
			{
				for(int j=i;j<e.length-1;j++)
				{
					e[j]=e[j+1];
				}
				break;
			}
			throw new CustomException("please enter valid employee id that existed");
			*/
		int j=0;
		for(Employee e1:e)
	{  
		
		if(e1.getId()== id)
		{
			e.remove(e1);
			j++;
			
			
		}
		
		
		
		}
		if(j==0)
		{
			throw new CustomException("please enter valid employee id that existed");
		}
		
			
		}
		
	

	
	public void Addemployee(ArrayList<Employee> e) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter eid");
	     int eempid=sc.nextInt();
	     
	   // e[size-1].empid=empid;
	    
	    System.out.println("enter name");
	     String nname=sc.next();
	     
	 //   e[size-1].name=name;
	    
	    
	    System.out.println("enter salary");
	     Long ssalary=sc.nextLong();
	     
	  //  e[size-1].empid=empid;
	    System.out.println("enter dept");
	     String ddesignation=sc.next();
	     
	  //  e[size-1].empid=empid;
	  
	     
	  //1  e[size-1].empid=empid;
	   
	    
		e.add(new Employee(eempid, nname, ssalary,ddesignation));
		
	}
	

	
	public void serchemployeebyid(ArrayList<Employee> e, int empid) throws CustomException {
		// TODO Auto-generated method stub
		
		
	/*	int j=0;
		
		for(int i=0;i< size; i++)
		{
			
			if(e[i].getId()== empid)
			{
				System.out.println(e[i]);
				j++;
			}
			
		}
		if(j==0)
		{
			throw new CustomException("entered employee doesnot existed");
		}
		
		*/
		int j=0;
		for(Employee e1:e)
	{  
		
		if(e1.getId()== empid)
		{
			System.out.println(e1);
			
			
		}
		if(j==0)
		{
			throw new CustomException("No such employee exists");
		}
		
		
		}
		
		
	}


	

	
	


	
	

}
