package learningJava;
public class AllocateNofPages {
	public static void main(String[] args) {
		
	}
	public static int maxOf(int []a) {
		int maximum=0;
		for(int t:a) {
			if(t>maximum) {
				maximum=t;
			}
		}
		return maximum;
	}
	public static int sumOf(int[] a) {
		int s=0;
		for(int t:a) {
			s+=t;
		}
		return s;
	}
	public static int minPages(int[] a,int k) {
		int min=maxOf(a),max=sumOf(a),res=0;
		while(min<=max) {
			int mid=(max=min)/2;
			if(isFeasible(a,k,mid)) {
				res=mid;
				max=mid-1;
			}else {
				min=mid+1;
			}
		}
		return res;
	}
	public static boolean isFeasible(int[] a,int k,int res) {
		int student=1,sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(sum+a[i]>res) {
				student++;
				sum=a[i];
			}
			sum+=a[i];
		}
		return student<=k;
	}
}