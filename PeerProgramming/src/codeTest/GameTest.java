package codeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Game;

public class GameTest {
	
	@Test 
	public void initialTotalTest() {
		Game rps0 = new Game();	
		assertNull("The number of games played is not 0", rps0.getTotalGames());				
	}

	@Test 
	public void initialCommonTest() {
		Game rps1 = new Game();
		assertNull("There is a most commonly picked figure", rps1.getMostCommon());
	}
	
	Game rps = new Game();

	@Test 
	public void totalTest() {
		assertNotNull("No games have been played", rps.getTotalGames());
	}
}
	
	@Test //??????
	public void quitCheck() {
		//assertTrue("Game has ended", rps.getStatus());
	}
	
	

	
	
	
	
}
