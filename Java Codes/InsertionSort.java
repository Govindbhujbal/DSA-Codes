package learningJava;

public class InsertionSort {
	public void insertionSort(int a[]) {
		int n=a.length;
		for(int i=1;i<n;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int a[]= {8,7,6,54,1,2,3};
		InsertionSort in=new InsertionSort();
		in.insertionSort(a);
		for(int aa:a) {
			System.out.println(aa);
		}
	}
}
