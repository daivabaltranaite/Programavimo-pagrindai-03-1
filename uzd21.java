package uzduotis03_1;

import java.util.Scanner;

public class uzd21 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a year:");
		int metai = reader.nextInt();

		if (metai % 4 == 0) {
			if (metai % 100 == 0) {
				if (metai % 400 == 0) {
					System.out.print("The year is a leap year");
				} else {
					System.out.print("The year is not a leap year");
				}
			} else {
				System.out.print("The year is a leap year");
			}
		} else {
			System.out.print("The year is not a leap year");
		}
		reader.close();
	}
}
