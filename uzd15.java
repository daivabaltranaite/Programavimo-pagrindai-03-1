package uzduotis03_1;

import java.util.Scanner;

public class uzd15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("How old are you?");
		int a = reader.nextInt();

		if (a >= 18) {
			System.out.println("You have reached the age of majority!");
		} else {
			System.out.println("You have not reached the age of majority yet!");
		}
		reader.close();
	}

}
