package code;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		char choice;
		
		Game game = new Game();
		
		Scanner sc = new Scanner(System.in);

		do {	
			System.out.println("How many time would you like to play?");
			int row = sc.nextInt();
			
			for (int i = 1; i <= row; i++) {

				System.out.println("Enter selection: ");
				String numberofPlay = sc.next();

				String computerPlay = game.selectComputer();
				
				if (numberofPlay.toUpperCase().equals(computerPlay.toUpperCase())) {
					game.totalGames[game.ties]++;
				}

				else if (numberofPlay.equals("Rock") || numberofPlay.equals("rock")) {
					if (computerPlay.equals("Scissors"))
						game.totalGames[game.humanWins]++;
					else
						game.totalGames[game.computerWins]++;
				}

				else if (numberofPlay.equals("Paper") || numberofPlay.equals("paper")) {
					if (computerPlay.equals("Rock"))
						game.totalGames[game.humanWins]++;
					else
						game.totalGames[game.computerWins]++;
				}

				else if (numberofPlay.equals("Scissors") || numberofPlay.equals("scissors")) {
					if (computerPlay.equals("Paper"))
						game.totalGames[game.humanWins]++;
					else
						game.totalGames[game.computerWins]++;
				} 
				else {
					game.totalGames[game.numberofInvalid]++;
				}
				
				System.out.println("You selected " + numberofPlay + ", and the computer selected " + computerPlay);
			}

			System.out.println("Ties: " + game.totalGames[game.ties]);
			System.out.println("Human wins: " + game.totalGames[game.humanWins]);
			System.out.println("Computer wins: " + game.totalGames[game.computerWins]);
			System.out.println("Rejected Results: " + game.totalGames[game.numberofInvalid]);

			System.out.println("Would you like to play another set of Game? ");
			System.out.println("if yes, press 'y' or 'Y' otherwise press any letter to terminate the program ");

			choice = sc.next().charAt(0);

		} while ((choice == 'y') || (choice == 'Y'));

		System.out.print("Thank you for running RPS Program");
		
		sc.close();
	}
}
