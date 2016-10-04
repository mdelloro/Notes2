package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public enum Roshambo {

	ROCK(0), PAPER(1), SCISSORS(2);

	private int rank;

	private Roshambo(int rank) {
		this.rank = rank;
	}

	public GameOutcome compareAgainst(Roshambo opponent) {
		int diff = this.rank - opponent.rank;
		if (diff < 0) {
			diff += 3;
		}
		switch (diff) {
		case 0:
			return GameOutcome.TIE;
		case 1:
			return GameOutcome.WIN;
		case 2:
			return GameOutcome.LOSS;
		default:
			throw new RuntimeException("This should never happen.");
		}
	}

}