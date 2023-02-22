package learningJava;
import java.util.Arrays;
import java.util.Comparator;
class Pair{
	int a = 8;
	void print() {
		a=99;
		int a = 0;
		System.out.println(a);
	}
	Integer marks;
	Integer age;
	Pair(){};
	Pair(int marks,int age){
		this.marks=marks;
		this.age=age;
	}
}

public class Random {
	static Pair obj1 = new Pair(10,20);
	static Pair obj2 = new Pair(11,21);
	static Pair obj3 = new Pair(12,22);
	static Pair obj4 = new Pair(13,23);
	
	public static void main(String[] args) {
		 Pair [] arr = {obj1,obj2,obj3,obj4};
		Arrays.sort(arr, new Comparator<Pair>(){
			@Override
			public int compare(Pair a, Pair b) {
				return b.age.compareTo(a.age);
			}
		});
		for(var p : arr) {
			System.out.println(p.marks+" "+p.age);
		}
	}
}
