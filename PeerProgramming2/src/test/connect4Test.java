package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.Game;

public class connect4Test {
	
	Game connect4 = new Game();

	int winner[];
	@Test
	public void horizontalCheck () {
		int indexes[][] = new int[7][6];
		for (int horizontalI = 1; horizontalI <= 4; horizontalI++) {
			winner[horizontalI] = indexes[1][horizontalI];
		}
		
		assertEquals("You did not win.", winner, connect4.getResult());
	}
	
	@Test
	public void verticalCheck () {
		int indexes[][] = new int[7][6];
		for (int verticalI = 1; verticalI <= 4; verticalI++) {
			winner[verticalI] = indexes[1][verticalI];
		}
		
		assertEquals("You did not win.", winner, connect4.getResult());
	}
	
	@Test
	public void diagonalCheck () {
		int indexes[][] = new int[7][6];
		for (int verticalI = 1; verticalI <= 4; verticalI++) {
			for (int horizontalI = 1; horizontalI <= 4; horizontalI++) {
				winner[verticalI] = indexes[verticalI][horizontalI];
			}
		}
		
		assertEquals("You did not win.", winner, connect4.getResult());
	}
	

}
