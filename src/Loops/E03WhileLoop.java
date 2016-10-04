package Loops;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class E03WhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Would you like to continue?");
		String userInput = scanner.next();

		while (userInput.equals("y")) {
			System.out.println("Do something.");

			System.out.println("Would you like to continue?");
			userInput = scanner.next();
		}

		System.out.println("Goodbye.");
		scanner.close();
	}

}