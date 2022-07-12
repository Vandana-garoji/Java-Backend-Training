package com.ftd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplicates {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		ArrayList<Integer> list2 =new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		HashSet<Integer> s =new HashSet<>();
		Boolean flag=false;
		int count=0;
		int temp=list.get(0);
		System.out.println(temp);
		s.add(1);
		
		do
		{  
				
			flag=true;
		for(  Integer i :list) 
		{  
			
			
			
			
			if( s.contains(i))
		    {    flag=false;
		        
				 count=count+1;
				 
				 temp = i;
				 System.out.println(temp+" if  "+count);
				 continue;
				 
				 
				 
		    }
			else
			{  
				s.add(i);
			    
				System.out.println(list2);
			    System.out.println(temp+" else "+count);
			    list2.add(temp + count);
			    count=1;
			    temp=i;
			}
			

		}
		list2.add(temp + count);
		
		s.clear();
		if(!flag)
		{
			list=list2;
			s.clear();
			
		}
//		else
//		{
//			break;
//		}
		
		
		
		
		
		}while(flag);
		//System.out.println(list2);
		System.out.println(list);
		
			
		
	}

}
