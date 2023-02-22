package learningJava;
import java.util.Scanner;

public class BS{
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String sen=sc.nextLine();
		int arr[]= {1,2,3,4,55,66,78};
		int target=4;
		System.out.println(search(arr,target,0,arr.length));
		}
	static int search(int[] arr,int target,int s,int e) {
//		if(s>e) {
//			return -1;
//		}
		int m=s+(e-s)/2;
		if(arr[m]==target) {
			return m;
		}
		if(target<arr[m]) {
			return search(arr,target,s,m-1);
		}else if(target>arr[m] && m+1<arr.length) {
			
			return search(arr,target,m+1,e);
		}else 
			return -1;
		
	}

}
