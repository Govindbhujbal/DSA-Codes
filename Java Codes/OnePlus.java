package learningJava;

import java.util.ArrayList;

public class OnePlus {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(9);
		al.add(9);
		al.add(1);
	}
	static ArrayList<Integer> onePlus(ArrayList<Integer> a) {
		int carry=2;
		int n=a.size();
		for(int i=n-1;i>=0;i--) {
			int num=a.get(i)+carry;
			a.set(i, num%10);
			carry=num/10;
			
		}
		if(carry>0) {
			a.add(n, 0);
			for(int i=n;i>=1;i--) {
				a.set(i,a.get(i-1) );
			}
			a.set(0, carry);
		}
		return a;
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	static int fact(int a) {
		if(a<=1) {
			return 1;
		}
		
		int fact=1;
		while(a>1) {
			fact=fact*a;
			a--;
		}
		return fact;
	}
}
