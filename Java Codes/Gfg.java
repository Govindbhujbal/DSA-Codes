package learningJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gfg {
	private int printFactorial(int n) {
		if(n<0) return -1;
//		if(n==0 || n==1) return 1;
//		return n*printFactorial(n-1);
		int ans = 1 ;
		for(int i=2;i<=n;i++) ans*=i;
		return ans;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		Gfg obj = new Gfg();
		int res = obj.printFactorial(number);
		System.out.println(res);
		int ans = 0;
		System.out.println(ans<<3);
	}
}