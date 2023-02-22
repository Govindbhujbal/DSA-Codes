package learningJava;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int[] a=new int[t];
		for(int i=0;i<t;i++) {
			a[i]=sc.nextInt();
		}
		SelectionSorting ss=new SelectionSorting();
		ss.selectionSort(a, t);
		for(int aa:a) {
			System.out.print(aa);
		}
		
	}
}
//[4,3,2,1]
class SelectionSorting{
	void selectionSort(int []a,int n) {
//		int min_pos;
		for(int i=0;i<n-1;i++) {
			int min_pos=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min_pos]) {
					min_pos=j;
				}
			}
			int temp=a[i];
			a[i]=a[min_pos];
			a[min_pos]=temp;
		}
	}
}
