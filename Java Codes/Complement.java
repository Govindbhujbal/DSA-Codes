package learningJava;
//this class is doing that taking any no returning its complement that is it's binary complement
public class Complement {
	public static void main(String[] args) {
		//this is no taken whose complement is to return
		int m=2;
		
		int mask=0;
		while(m!=0) {
			//take right shift of given no 
			m>>=1;
			//take left shift of mask that much no of time jitna ki right shift hua hai
			mask=mask<<1 | 1;
		}
		//doing anding with negation of no
		int ans= ~2 & mask;
		System.out.println(ans);
	}
}
