package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Player player;

		player = new RockPlayer("The Rock");
		System.out.println(player.getName() + " plays " + player.generateRoshambo());

		player = new RandomPlayer("The Random");
		System.out.println(player.getName() + " plays " + player.generateRoshambo());

		player = new ScannerPlayer(scanner, "David");
		System.out.println(player.getName() + " plays " + player.generateRoshambo());
	}

}