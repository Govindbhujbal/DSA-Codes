package learningJava;

import java.util.HashSet;

public class SubArraySum {
	public static void main(String[] args) {
		int n=5;
//		System.out.println(aa(99));
		String o=Integer.toBinaryString(n);
		System.out.println(o.getClass().getName());
		Integer aa=Integer.parseInt(o);
		System.out.println(aa.getClass().getName());
		System.out.println(aa);
		int ab=aa+5;
		System.out.println(ab);
		String sss=String.format("%d", n);
		System.out.println(sss.getClass().getName());
		int kk=Integer.parseInt(sss);
		System.out.println(kk+6);
	}
	static String aa(int n) {
		int bits=0;
		while(n>0) {
			bits+=1;
			System.out.println(n);
			n=n&(n-1);
			
		}
		return (bits%2==0?"even":"odd");
	}
}
