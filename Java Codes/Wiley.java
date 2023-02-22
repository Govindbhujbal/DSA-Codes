package learningJava;

import java.util.Scanner;

public class Wiley {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, c = 1;
		boolean increase = true;
		n = sc.nextInt();
		for (i = 1; i <= (2 * n) - 1; i++) {
			for (j = 1; j <= (2 * n) - 1; j++) {
				if (i == j || i + j == 2 * n)
					System.out.print(c);
				else
					System.out.print("    ");
			}
			if (c == n) {
				increase = false;
			}
			if (increase && c < 5)
				c++;
			if (!increase && c <= 5)
				c--;
			System.out.println();
		}

	}
}