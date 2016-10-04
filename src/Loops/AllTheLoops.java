package Loops;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class AllTheLoops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ** For loop **
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(i);
		}

		// ** While loop **
		System.out.println("Would you like to continue?");
		String userInput = scanner.next();  // <-- Prime the loop

		while (userInput.equals("y")) {
			System.out.println("Do something.");

			System.out.println("Would you like to continue?");
			userInput = scanner.next();
		}

		// ** Do loop **
		do {
			System.out.println("Do something.");

			System.out.println("Would you like to continue?");
			userInput = scanner.next();
		} while (userInput.equals("y"));


		// ** Enhanced For loop (For Each loop) **
		String[] items = { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" };

		for (String item : items) {
			System.out.println(item);
		}


		System.out.println("Goodbye.");
		scanner.close();
	}

}