package learningJava;

public class SelectionSort23 {
	public void selectionSort(int a[]) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
		if(min!=i) {	
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		}
	}
	public static void main(String[] args) {
		int a[]= {8,7,6,5,4,1,2,3};
		SelectionSort23 ss=new SelectionSort23();
		ss.selectionSort(a);
		for(int aa:a) {
			System.out.println(aa);
		}
	}
}
