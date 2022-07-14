package com.ftd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Game {
	
	
	public static <K,V> void writefile( HashMap<K,V> map )//throws IOException
	{
	
		
			try
			{
			BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Vandana\\Desktop\\Gitprac\\Example.txt"));
			 bf.write("{");
	        for (Entry<K, V> entry :
	        	
	             map.entrySet()) {
	        	
	        	 bf.write("{"+entry.getKey() + ":"
	                      + entry.getValue()+"},");
	            
	        }
	        
	        bf.write("}");
			
	       bf.close();
			}
		     catch (IOException e)
			{
		         e.printStackTrace();
		     }
		    
		     

			
	}
	
	
	
	
	
 

     public static  void  readfile(File f )
     {
    	
     
     try(BufferedReader br=new BufferedReader(new FileReader(f)))
     {
     	String st;
     while((st = br.readLine()) != null)
     {
     	System.out.println(st);
     }
     br.close();
     }
     catch(Exception e)
     {
     	e.printStackTrace();
     }
     
     }
     
    
  
    public static void main(String[] args)
    {
  
         
        // key-value pairs
    	File f = new File("C:\\Users\\Vandana\\Desktop\\Gitprac\\Example.txt");
    	
    	
    	 HashMap<String, Integer> map = new HashMap<String, Integer>();
    	 
    	 
    	 
    	 Scanner sc=new Scanner(System.in);
    	 int n=3;
         String key;
         int value;
    	      
    	      for(int i=0;i<n;i++)
    	      {    
    	      	System.out.println("Enter Key");
    	      	key=sc.next();
    	      	
    	      	
    	      	System.out.println("Enter Value");
    	      	value=sc.nextInt();
    	      	
    	          map.put(key, value);
    	      
    	      }
    	
    	
		writefile(map);
		
    
    	readfile(f);
  
       
            
           
        }
    
}
