package learningJava;
import java.io.*;
import java.util.*;
public class SpiralArray {
	    public static void main(String args[])throws IOException
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        
	        while(t-- > 0)
	        {
	            int r = sc.nextInt();
	            int c = sc.nextInt();
	            
	            int matrix[][] = new int[r][c];
	            
	            for(int i = 0; i < r; i++)
	            {
	                for(int j = 0; j < c; j++)
	                 matrix[i][j] = sc.nextInt();
	            }
	            Solution ob = new Solution();
	            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
	            for (Integer val: ans) 
	                System.out.print(val+" "); 
	            System.out.println();
	        }
	    }
	}// } Driver Code Ends


	class Solution
	{
	    //Function to return a list of integers denoting spiral traversal of matrix.
	    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
	    {
	        // code here 
	       // ArrayList<Integer> al=new Arraylist<>();
	       ArrayList<Integer> ans=new ArrayList<>();
	        int sr=0;
	        int sc=0;
	        int er=r-1;
	        int ec=c-1;
	        int total=r*c;
	        int count=0;
	        while(count<total)
	        {
	            //starting row
	            for(int index=sc;count<total & index<=ec;index++){
	                ans.add(matrix[sr][index]);
	                count++;
	            }
	            sr++;
	            //ending column
	            for(int index=sr;count<total & index<=er;index++){
	                ans.add(matrix[index][ec]);
	                count++;
	            }
	            ec--;
	            //ending row
	            for(int index=ec;count<total & index>=sc;index--){
	                ans.add(matrix[er][index]);
	                count++;
	            }
	            er--;
	            //starting column
	            for(int index=er;count<total & index>=sr;index--){
	                ans.add(matrix[index][sc]);
	                count++;
	            }
	            sc++;
	            
	            
	        }
	        return ans;
	    }
	}
