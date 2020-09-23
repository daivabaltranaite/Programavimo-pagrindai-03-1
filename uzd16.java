package uzduotis03_1;

import java.util.Scanner;

public class uzd16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a number");
		int a = reader.nextInt();

		if (a % 2 == 0) {
			System.out.println("Number " + a + " is even.");
		} else {
			System.out.println("Number " + a + " is odd.");
		}
		reader.close();
	}

}
