package learningJava;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {5,7,3,9,1,5,2,7,3,8,9,3,0,4};
		int n = arr.length;
		MergeSort obj = new MergeSort();
		obj.mergeSort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	void mergeSort(int[] arr,int beg, int end) {
		if(beg<end) {
			int mid = (beg+end)/2;
			mergeSort(arr,beg,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,beg,mid,end);
		}
	}
	void merge(int [] arr, int beg,int mid, int end) {
		int i,j,k;		
		int n1,n2;
		n1=mid-beg+1;		
		n2=end-mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		for( i=0;i<n1;i++) {
			leftArr[i]=arr[beg+i];
		}
		for(j=0;j<n2;j++) {
			rightArr[j]=arr[mid+1+j];
		}
		i=0;
		j=0;
		k=beg;
		while(i<n1 && j<n2) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
}
