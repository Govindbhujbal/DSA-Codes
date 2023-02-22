package learningJava;

import java.util.Arrays;

class MaxSum {
	public static void main(String args[]) {
		int[] arr = {5,4,1,2,9,8,7,3,5,44,-5,88,2,0,6};
		int high = arr.length-1;
		quickSort(arr,0,high);
		System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int loc = partition(arr,low,high);
			if(loc>0) {
				quickSort(arr,low,loc-1);
			}
			if(loc<arr.length-1) {
				quickSort(arr,loc+1,high);
			}
		}
	}
	public static int partition(int[] arr,int low, int high) {
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
		temp = arr[start];
		arr[start]=arr[high];
		arr[high]=temp;
		return high;
	}
}