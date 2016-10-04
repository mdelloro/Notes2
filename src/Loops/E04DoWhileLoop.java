package Loops;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class E04DoWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput;

		do {
			System.out.println("Do something.");

			System.out.println("Would you like to continue?");
			userInput = scanner.next();
		} while (userInput.equals("y"));

		System.out.println("Goodbye.");
		scanner.close();
	}

}