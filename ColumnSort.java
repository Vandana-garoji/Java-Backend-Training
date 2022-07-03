package vandy;

import java.util.Arrays;
public class ColumnSort {

	public static void main(String[] args) {
        int[][] arr=new int[][] {new int[] {8,5,2,1,6}, new int[] {2,11,98,25,10},new int[]{35,21,50,12,2}, new int[] {16,0,18,60,1}};
     int m=arr.length-1,n=arr.length-1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
       int temp[][]=new int[4][4];
       int temp1[][]=new int[4][4];
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length;j++) {
        		temp[i][j]=arr[j][i];
        		
        	}
        }
        
        for(int i=0;i<arr.length;i++) {
        	{
        		Arrays.sort(temp[i]);
        	}
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            	temp1[i][j]=temp[j][i];
                System.out.print(temp1[i][j] + " ");
            }
            System.out.println();
        }
        
        }
        
    }