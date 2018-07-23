package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Game;

public class GameTest {
	
	Game game = new Game();
	
	@Test
	public void gameExistanceCheck() {
		assertNotNull(game);
	}
	
	@Test
	public void moveOfPlayer() {
		game.locationUpdate("north");
		game.locationUpdate("south");
		game.locationUpdate("west");
		game.locationUpdate("east");
	}
	
	@Test
	public void checkForStories() {
		assertNotNull(game.surroundingsInformation());
	}

}
