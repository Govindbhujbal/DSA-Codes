package learningJava;
public class AllocateMinimumNoPages {
	public static void main(String[] args) {
		int a[]= {10,20,5,15,5};
		System.out.println(minimumPages(a,2));
	}
	public static int minimumPages(int a[],int k) {
		int res = 0;
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			min=Math.max(min, a[i]);
		}
		int max=0;
		for (int i = 0; i < a.length; i++) {
			max+=a[i];
		}
		while(min<=max) {
			int mid=(min+max)/2;
			if(isFeasible(a,k,mid)) {
				res=mid;
				max=mid-1;
			}else {
				min=mid+1;
			}
		}
		return res;
	}
	private static boolean isFeasible(int[] a, int k, int res) {
		int student=1;
		int sum=0;
		for (int j = 0; j < a.length; j++) {
			if(sum+a[j]>res) {
				student++;
				sum=a[j];
			}else {
				sum+=a[j];				
			}
		}
		return student<=k;
	}
}