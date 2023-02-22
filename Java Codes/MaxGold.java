package learningJava;
public class MaxGold {
	static int solve(int[] arr) {
		int n = arr.length; // 1 2 3 4 5
		int ans=0;
		for(int i=0;i<n;) {
//			ans=ans+Math.max(arr[i+1], arr[i]+arr[i+2]);
			if(arr[i]+arr[i+2]>=arr[i+1]) {
				ans=ans+arr[i];
				i=i+2;
			}else {
				ans=ans+arr[i+1];
				i=i+2;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		System.out.println(solve(arr));
		
	}
}
