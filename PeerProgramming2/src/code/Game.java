package code;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

public class Game {
	
	int board[][] = new int[7][6];
	int player1 = 1;
	int player2 = 2;
	int winner = 0;

	public Game() {
		drawBoard();
		for (int i = 0; i < 42; i++) {
			int column = generateColumn();
			int row = generateRow(column);
			
			if (row != 0) {
				if (i%2 > 0) {
					//addDisc(column, row, player1);
					if(addDisc(column, row, player1))
						winner = player1;
				}
				else {
					//addDisc(column, row, player2);
					if(addDisc(column, row, player2))
						winner = player2;
				}
			}			
		}					
	}
	
	public int generateColumn() {
		return ThreadLocalRandom.current().nextInt(1, 7+1);		
	}
	
	public void drawBoard() {
		for (int hI = 0; hI < 7; hI++) {
			for (int vI = 0; vI < 6; vI++) {
				System.out.print(board[hI][vI]);
			}
		}
		/*	
		for(int count = 0; count < 6; count++) {
		drawRowTitle();
		System.out.println(count);
		}*/
	}
	
	public void drawRowTitle() {
		System.out.println("1..2..3..4..5..6..7");
	}
	public void drawRow() {
		System.out.println("1\n2\n3\n4\n5\n6");
	}
	
	public int generateRow(int column) {
		int row = 0;
		for (int i = 6; i >= 1; i--) {
			if (board[column][i] == 0) {
				row = i;
			}		
		}
		return row;
	}
	
	public boolean addDisc(int column, int row, int player) {
		board[column][row] = player;
		return checkForWin(player);
	}
	
	public boolean checkForWin(int player) {
		int startingpoint[] = {0, 0};
		boolean winnerCheck = false;
		
		for (int localisationOuter = 1; localisationOuter <=6; localisationOuter++) {
			for (int localisationInner = 1; localisationInner <=6; localisationInner++) {
				if (board[localisationOuter][localisationInner] == player)
					startingpoint[0] = localisationOuter;
					startingpoint[1] = localisationInner;
			}
		}
		
		if (winnerCheck == horizontalCheck(startingpoint, player))
			return true;
		else if (winnerCheck == verticalCheck(startingpoint, player))
			return true;
	//	else if (winnerCheck == diagonalCheck(startingpoint, player))
		//	return true;
		else
			return false;
		
		
	}
	
	public boolean horizontalCheck(int startingpoint[], int player) {
		int discsInARow = 0;

		for (int horizontalCheck = startingpoint[0]; horizontalCheck <=6; horizontalCheck++) {
			for (int i = 1; i <= 4; i++) {
				if (board[horizontalCheck][i] == player)
					discsInARow++;
			}
		} 
		if (discsInARow >= 4)
			return true;
		else 
			return false;
	}
	
	public boolean verticalCheck(int startingpoint[], int player) {
		int discsInARow = 0;

		for (int verticalCheck = startingpoint[0]; verticalCheck <=5; verticalCheck++) {
			for (int i = 1; i <= 4; i++) {
				if (board[i][verticalCheck] == player)
					discsInARow++;
			}
		}
		
		if (discsInARow >= 4)
			return true;
		else 
			return false;
	}
	
	/*public boolean diagonalCheck(int startingpoint[], int player) {
		int discsInARow = 0;

		for (int verticalCheck = startingpoint[0]; verticalCheck <=6; verticalCheck++) {
			
			for (int i = 1; i <= 4; i++) {
				if (board[i][verticalCheck] == player)
					discsInARow++;
			}
		}
		
		if (discsInARow >= 4)
			return true;
		else 
			return false;
	}*/
	
	
	
	

	public int getResult() {
		return winner;
	}
	
}
