package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public abstract class Player {

	private String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

}