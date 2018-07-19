package code;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

	final int ties = 0;
	final int computerWins = 1;
	final int humanWins = 2;
	final int numberofInvalid = 3;
	
	int totalGames[] = { 0, 0, 0, 0 };
	
	public static String selectComputer() {
		int selection = ThreadLocalRandom.current().nextInt(0, 2+1);
		
		if (selection == 0)
			return "Rock";
		else if (selection == 1)
			return "Paper";
		else
			return "Scissors";
	}
	
	public int getTotalGames() {
		int totalNumber = 0;
		
		for (int i : totalGames) {
			totalNumber += totalGames[i];
		}
		return totalNumber;
	}
	
	public String getMostCommon() {
		return "hepp!";
	}
	
	public String getStatus() {
		return "hepp!";
	}

}
