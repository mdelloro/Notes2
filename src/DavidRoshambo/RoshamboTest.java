package DavidRoshambo;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import org.junit.Assert;
import org.junit.Test;

public class RoshamboTest {

	@Test
	public void testRockBeatsScissors() {
		GameOutcome result = Roshambo.ROCK.compareAgainst(Roshambo.SCISSORS);
		Assert.assertEquals(GameOutcome.WIN, result);
	}

	@Test
	public void testRockTiesRock() {
		GameOutcome result = Roshambo.ROCK.compareAgainst(Roshambo.ROCK);
		Assert.assertEquals(GameOutcome.TIE, result);
	}

	@Test
	public void testRockLosesToPaper() {
		GameOutcome result = Roshambo.ROCK.compareAgainst(Roshambo.PAPER);
		Assert.assertEquals(GameOutcome.LOSS, result);
	}

	@Test
	public void testPaperBeatsRock() {
		GameOutcome result = Roshambo.PAPER.compareAgainst(Roshambo.ROCK);
		Assert.assertEquals(GameOutcome.WIN, result);
	}

	@Test
	public void testPaperTiesPaper() {
		GameOutcome result = Roshambo.PAPER.compareAgainst(Roshambo.PAPER);
		Assert.assertEquals(GameOutcome.TIE, result);
	}

	@Test
	public void testPaperLosesToScissors() {
		GameOutcome result = Roshambo.PAPER.compareAgainst(Roshambo.SCISSORS);
		Assert.assertEquals(GameOutcome.LOSS, result);
	}

	@Test
	public void testScissorsBeatsPaper() {
		GameOutcome result = Roshambo.SCISSORS.compareAgainst(Roshambo.PAPER);
		Assert.assertEquals(GameOutcome.WIN, result);
	}

	@Test
	public void testScissorsTiesScissors() {
		GameOutcome result = Roshambo.SCISSORS.compareAgainst(Roshambo.SCISSORS);
		Assert.assertEquals(GameOutcome.TIE, result);
	}

	@Test
	public void testScissorsLosesToRock() {
		GameOutcome result = Roshambo.SCISSORS.compareAgainst(Roshambo.ROCK);
		Assert.assertEquals(GameOutcome.LOSS, result);
	}

}