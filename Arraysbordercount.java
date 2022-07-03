package vandy;

import java.lang.*;
public class Arrays {

    public static void main(String[] args)
    {
   
   
    int[][] arr=new int[][] {new int[] {0,1,0,0,1}, new int[] {1,0,1,0,1},new int[]{0,1,0,0,1}, new int[] {1,0,1,0,1}};
     int m=arr.length-1,n=arr.length-1;
      
     
     for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
     
        int i=3,j=3;
        int sum=4;
        int temp;
       
       
     
       
        try {
            
        temp=arr[i-1][j];
       
        }
        catch (Exception e) {
        sum=sum-1;
       
        }          
          try {
           
           
            temp=arr[i-1][j-1];
           
            }
            catch (Exception e) {
            sum=sum-1;
           
            }
             try {
            
            temp=arr[i][j+1];
            }
            catch (Exception e) {
            sum=sum-1;
           
            }
             try {
           
            temp=arr[i+1][j+1];
            }
            catch (Exception e) {
            sum=sum-1;
           
            }
             finally {
             System.out.println(sum);
             }
                     
           
           
       
        }
    }
