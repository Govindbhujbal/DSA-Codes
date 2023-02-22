package learningJava;

import java.util.HashSet;
import java.util.Set;

public class Dup {
	public static void main(String[] args) {
		String string = "Big black bug bit a BIG black dog on his big black nose";
		int count;

		Set<String> al = new HashSet<>();
		String words[] = string.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					al.add(words[i]);
				}
			}
		}
		if(al.isEmpty()) System.out.println("NA");
		for(String s: al) System.out.println(s);

	}
}