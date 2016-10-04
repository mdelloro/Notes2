package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public class RandomPlayer extends Player {

	public RandomPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		int random = (int) (Math.random() * 3) + 1;

		switch (random) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		case 3:
			return Roshambo.SCISSORS;
		default:
			return null;
		}

	}

}