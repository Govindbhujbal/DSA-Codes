package learningJava;

import java.util.Scanner;

public class TreeImplementaion {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		createTree();
		
	}
	
	static Nodec createTree() {
		
		Nodec root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Nodec(data);
		
		System.out.println("Enter left for "+data);
	    root.left = createTree();

	    System.out.println("Enter right for "+data);
	    root.right = createTree();
		
		return root;
		
	}
}
class Nodec {
	Nodec left, right;
	int data;
	
	public Nodec(int data) {
		this.data = data;
	}
}