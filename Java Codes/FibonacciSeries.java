package learningJava;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int fib1=0,fib2=1;
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.print(fib1+" "+fib2+" ");
		for(int i=2;i<n;i++) {
			int fib=fib1+fib2;
			System.out.print(fib+" ");
			
			fib1=fib2;
			fib2=fib;
		}
	}
}
