package learningJava;
import java.util.ArrayList;
import java.util.List;
public class PlusOne {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(9);
		al.add(9);
		al.add(9);
		System.out.println(plusOne(al));
	}
	static public List<Integer> plusOne(ArrayList<Integer> digits) {
		int carry=1;
		int n=digits.size();
		for (int i = n-1;i>=0; i--) {
			int num=digits.get(i)+carry;
			digits.set(i, num%10);
			carry=num/10;
		}
		if(carry>0) {
			digits.add(n, 0);
			for(int i=n-1;i>=1;i--) {
				digits.set(i, digits.get(i-1));
			}
			digits.set(0, carry);
		}
		return digits;
	}
}
