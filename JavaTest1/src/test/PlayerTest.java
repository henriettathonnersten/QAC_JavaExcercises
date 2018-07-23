package test;

import static org.junit.Assert.*;

import org.junit.Test;
import code.Player;

public class PlayerTest {
	
	Player player = new Player();
	
	@Test 
	public void personExistanceCheck() {
		assertNotNull(player);
	}
		
	@Test
	public void getNorthSouth() {
		assertNotNull("The player is not at the expected horisontal location", player.getHorizontalLocation());
	}
	
	@Test
	public void setNorthSouth() {
		player.setHorizontalLocation(10.00);
		assertEquals("The player is not at the expected horisontal location", 10, player.getHorizontalLocation(), 0);
	}
	
	@Test
	public void getWestEast() {
		assertNotNull("The player is not at the expected vertical location", player.getVerticalLocation());
	}
	
	@Test
	public void setWestEast() {
		player.setVerticalLocation(10.00);
		assertEquals("The player is not at the expected vertical location", 10, player.getVerticalLocation(), 0);
	} 
	
	@Test // all directions? 
	public void locationUpdate() {
		player.setHorizontalLocation(10.00);
		assertEquals("The player is not where expected", 9, player.move("H", -1), 0);
	}
	
}
