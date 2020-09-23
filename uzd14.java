
package uzduotis03_1;

import java.util.Scanner;

public class uzd14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a number");
		int a = reader.nextInt();

		if (a > 0) {
			System.out.println("The Number is Positive");
		} else if (a < 0) {
			System.out.println("The Number is Negative");
		} else {
			System.out.println("Nulis");
		}

		reader.close();
	}
}
