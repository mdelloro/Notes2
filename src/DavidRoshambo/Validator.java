package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class Validator {

	public static boolean yesOrNo(Scanner scanner, String prompt) {
		while (true) {
			System.out.println(prompt);
			String userInput = scanner.nextLine();
			userInput = userInput.toLowerCase();

			if (userInput.startsWith("y")) {
				return true;
			} else if (userInput.startsWith("n")) {
				return false;
			} else {
				System.out.println("I didn't understand your response. Please enter 'yes' or 'no'.");
			}
		}
	}
}