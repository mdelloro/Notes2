package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class RoshamboGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String playerName = selectName(scanner);
		Player you = new ScannerPlayer(scanner, playerName);
		Player opponent = selectOpponent(scanner);

		int wins = 0, ties = 0, losses = 0;

		do {
			Roshambo yourHand = you.generateRoshambo();
			Roshambo oppenentHand = opponent.generateRoshambo();

			GameOutcome outcome = yourHand.compareAgainst(oppenentHand);

			switch (outcome) {
			case WIN:
				System.out.println(yourHand + " beats " + oppenentHand + ". Congrats. You win!");
				wins++;
				break;
			case TIE:
				System.out.println(yourHand + " ties " + oppenentHand + ". It's a draw.");
				ties++;
				break;
			case LOSS:
				System.out.println(oppenentHand + " beats " + yourHand + ". " + opponent.getName() + " defeated you this time.");
				losses++;
				break;
			}

		} while (Validator.yesOrNo(scanner, "Would you like to play again?"));

		System.out.println();
		System.out.println("Here's your record against " + opponent.getName());
		System.out.println("Wins:   " + wins);
		System.out.println("Ties:   " + ties);
		System.out.println("Losses: " + losses);
		if (wins > losses) {
			System.out.println(you.getName() + ", you have triumphed over " + opponent.getName() + "!");
		} else if (losses > wins) {
			System.out.println(you.getName() + ", it's not your lucky day; you have been overcome by " + opponent.getName() + ".");
		} else {
			System.out.println("Alas, there is no winner today.");
		}

		System.out.println("Thanks for playing.");

		scanner.close();
	}

	private static String selectName(Scanner scanner) {
		System.out.println("Hello. What is your name?");
		return scanner.nextLine();
	}

	private static Player selectOpponent(Scanner scanner) {
		System.out.println("Do you want to play against Randy or Rockwell?");
		String opponentChoice = scanner.nextLine().toLowerCase();

		switch (opponentChoice) {
		case "randy":
			return new RandomPlayer("Randy");
		case "rockwell":
			return new RockPlayer("Rockwell");
		default:
			throw new IllegalArgumentException("Must type 'Randy' or 'Rockwell'.");
		}
	}

}