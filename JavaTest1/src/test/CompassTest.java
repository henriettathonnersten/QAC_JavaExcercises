package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Compass;
import code.Player;

public class CompassTest {

	Player player = new Player();
	Compass compass = new Compass(player);
	
	@Test
	public void compassExistanceCheck() {
		assertNotNull(compass); 
	}
	
	@Test
	public void distanceCheck() {
		assertNotNull("The compass cannot find a distance", compass.getNewDistance());
	}
	
	@Test
	public void compassConverter() {
		assertEquals("The compass returns a positive number when a positive was entered", 1.3, compass.checkNegative(-1.3), 0);
	}
	
}
