package vandy;
public class Border {

    public static void main(String[] args) {
        int[][] arr=new int[][] {new int[] {0,1,0,0,1}, new int[] {1,0,1,0,1},new int[]{0,1,0,0,1}, new int[] {1,0,1,0,1}};
     int m=arr.length-1,n=arr.length-1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            	if(i==m && j==n)
            	{
            		System.out.print("  ");
            		continue;
            	}
            	if((i== m || i== m-1 || i==m+1 ) && (j== n || j== n-1 || j==n+1 ))
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }

}