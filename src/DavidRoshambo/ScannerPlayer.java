package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class ScannerPlayer extends Player {

	private Scanner scanner;

	public ScannerPlayer(Scanner scanner, String playerName) {
		super(playerName);
		this.scanner = scanner;
	}

	@Override
	public Roshambo generateRoshambo() {
		while (true) {
			System.out.println("Rock, Paper or Scissors?");
			String response = scanner.nextLine();
			response = response.toLowerCase();
			if (response.startsWith("r")) {
				return Roshambo.ROCK;
			} else if (response.startsWith("p")) {
				return Roshambo.PAPER;
			} else if (response.startsWith("s")) {
				return Roshambo.SCISSORS;
			} else {
				System.out.println("I didn't understand your response. Please type 'rock', 'paper', or 'scissors'.");
			}
		}
	}

}