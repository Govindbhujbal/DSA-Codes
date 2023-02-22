package learningJava;

public class Pattern4 {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
//			if(i==1)
//				continue;
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
