package learningJava;

import java.util.Arrays;

public class QuickSor {
	public static void main(String[] args) {
		int[] arr = {6,5,7,3,8,2,0,1,9};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int[] arr, int low, int high) {
		if(low<high) {
			int loc = partition(arr,low,high);
			if(loc>0) {
				sort(arr,low,loc-1);
			}
			if(loc<arr.length-1) {
				sort(arr,loc+1,high);
			}
		}
	}
	static int partition(int []arr, int low, int high) {
		int pivot = arr[low];
		int start = low;
		int temp;
		while(low<high) {
			while(low<=high && arr[low]<=pivot) low++;
			while(low<=high && arr[high]>pivot) high--;
			if(low<high) {
				temp = arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
			}
		}
		temp=arr[start];
		arr[start]=arr[high];
		arr[high]=temp;
		return high;
	}
}
