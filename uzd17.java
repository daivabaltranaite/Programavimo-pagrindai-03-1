package uzduotis03_1;

import java.util.Scanner;

public class uzd17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type the first number:");
		int a = reader.nextInt();
		System.out.println("Type the second number:");
		int b = reader.nextInt();

		if (a > b) {
			System.out.println("Greater number:" + a);
		} else if (a == b) {
			System.out.println("The numbers are equal!");
		} else {
			System.out.println("Greater number:" + b);
		}
		reader.close();
	}

}
