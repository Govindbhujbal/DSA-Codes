package learningJava;

public class TripletWithZeroSum{
	static boolean twoSum(int[] a,int x,int i) {
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]<x) i++;
			else if(a[i]+a[j]>x) j--;
			else return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {1,0,-55,2,3,4,-1};
		for(int i=0;i<arr.length-2;i++) 
			if(twoSum(arr,-arr[i],i+1)) 
				System.out.println(1);
		System.out.println(0);
	}
}
