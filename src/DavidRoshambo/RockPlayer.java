package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public class RockPlayer extends Player {

	public RockPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}