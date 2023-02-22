package learningJava;
public class PowerOf2 {
	public static boolean ispoweroftwo(int n) {
		int ans=1;
		for(int i=0;i<=30;i++) {
			if(ans==n) {
				return true;
			}
			if(ans<Integer.MAX_VALUE/2) {
				ans*=2;
			}
			System.out.println(ans);
			
		}
		System.out.println(Integer.MAX_VALUE);
		return false;
	}
	public static void main(String[] args) {
		ispoweroftwo(5);
	}
}
