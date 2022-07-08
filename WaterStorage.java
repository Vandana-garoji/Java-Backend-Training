package com.mypackage;

import java.util.ArrayList;
class Mainn
{
	public static void main(String[] args) 
	{
		
		ArrayList<implementation> i=new ArrayList<>();
		i.add(new implementation(0,1));
		i.add(new implementation(1,5));
		i.add(new implementation(2,4));
		i.add(new implementation(3,7));
		i.add(new implementation(4,1));
		i.add(new implementation(5,9));
		int capacity=25;
							

        logic lo=new logic();


        System.out.println(lo.calculateLevel(i,capacity));		
	}
}

class logic
{
   
    public int calculateLevel(ArrayList<implementation> i,int capacity)
   {
      // int l=i.size();
       int filled=0,level=1;
       while( filled<=capacity)
       {
           
           
           for(implementation i1 :i)
	     	{		    
		      if( i1.value -level <0)
		      {
		      filled=filled+1;
		      }
		      
            }
          // filled = filled+l-1;
            
           if(filled>=capacity)
                break;
           level=level+1;

       }
       return level;
       
   }
}


class implementation
{  int value;
   int key;
   public implementation(int key,int value)
   
   {   
       this.key=key;
       this.value=value;
     
   }
   
   
}


