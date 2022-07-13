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
     
	 public static void writefile(File f )
     {
     int n=3;
     String key;
     int value;
     Scanner sc=new Scanner(System.in);
     HashMap<String, Integer> map = new HashMap<String, Integer>();

     
     
     for(int i=0;i<n;i++)
     {    
     	System.out.println("Enter Key");
     	key=sc.next();
     	
     	
     	System.out.println("Enter Value");
     	value=sc.nextInt();
     	
         map.put(key, value);
     
     }
     
     BufferedWriter bf = null;
     
     try {

         
         bf = new BufferedWriter(new FileWriter(f));

        bf.write("{");
        bf.newLine();
         for (Entry<String, Integer> entry : map.entrySet()) {

             
             bf.write("{"+entry.getKey() + ":"
                      + entry.getValue()+"}");

             
             bf.newLine();
         }
         bf.write("}");

         bf.flush();
     }
     catch (IOException e) {
         e.printStackTrace();
     }
     finally {

         try {

            
             bf.close();
         }
         catch (Exception e) {
         }
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
     }
     catch(Exception e)
     {
     	
     }
     }
     
    
  
    public static void main(String[] args)
    {
  
         
        // key-value pairs
    	File f = new File("C:\\Users\\Vandana\\Desktop\\Gitprac\\Example.txt");
    	
    	writefile(f);
    	readfile(f);
  
       
            
           
        }
    
}
