package learningJava;
import java.util.*;
import java.io.*;
class KlargestElt
{
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     
     while(t > 0)
     {
         int n = sc.nextInt();
         int k = sc.nextInt();
         
         int arr[] = new int[n];
         for(int i = 0; i<n; ++i)
             arr[i] = sc.nextInt();
         BubbleSort ob = new BubbleSort();
         ArrayList<Integer> list = ob.kLargest(arr, n, k);
         for(int i = 0; i<list.size(); i++)
             System.out.print(list.get(i) + " ");
         System.out.println();
         t--;
     }
 }
}


//} Driver Code Ends


//User function Template for Java

class Solution
{
 //Function to return k largest elements from an array.
 public static ArrayList<Integer> kLargest(int arr[], int n, int k)
 {
     // code here 
   Arrays.sort(arr);
     //Collections.reverseOrder(arr);
	 Collections.reverse(Arrays.asList(arr));
     ArrayList<Integer> al=new ArrayList<>();
    // Collections.reverse(al);
     for(int i=0;i<k;i++){
        // System.out.println(arr[i]);
        al.add(arr[i]); 
         
     }
     
     return al;
     
 }
}