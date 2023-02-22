package learningJava;
public class RainWaterTrapping {
	public static void main(String[] args) {
	}
	static int rainWaterTrapping(int[] a) {
		int[] left=new int[a.length];
		int[] right=new int[a.length];
		left[0]=a[0];
		right[a.length-1]=a[a.length-1];
		int sum=0;
		for(int i=1;i<a.length;i++) {
			left[i]=Math.max(left[i], left[i-1]);
		}
		for(int i=a.length-2;i>=0;i--) {
			right[i]=Math.max(right[i], right[i+1]);
		}
		for (int i = 0; i < right.length; i++) {
			sum+=(Math.max(left[i], right[i])-a[i]);
		}
		return sum;
	}	
}
