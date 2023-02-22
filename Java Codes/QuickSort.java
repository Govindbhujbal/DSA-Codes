package learningJava;
public class QuickSort {
	public void sort(int a[],int low,int high) {
		if(low<high) {
			int pivot = partition(a,low,high);
			sort(a,low,pivot-1);
			sort(a,pivot+1,high);
		}
	}
	int partition(int a[],int low,int high) {
		int pivot = a[(low+high)/2];
		int i=low;
		int j=high-1;
		while(i<j) {
			while(a[i]<=pivot && i<=high-1) {
				i++;
			}
			while(a[j]>pivot && j>=low) {
				j--;
			}
			if(i<j) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int a[]= {8,7,6,5,4,1,2,3};
		QuickSort q = new QuickSort();
		q.sort(a,0,(a.length));
		for(int aa:a) {
			System.out.println(aa);
		}
	}
}