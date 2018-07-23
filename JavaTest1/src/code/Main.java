package code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		double distanceFromTreasure = 100.0; 

		System.out.println("You awaken to find yourself in a barren moor.\n"
				+ "You notice a small watch-like device in your left hand.\n"
				+ "It has hands like a watch, but the hands don\'t seem to tell time.\n"
				+ "Try \"north\", \"south\", \"east\", \"west\" to move, or \"look\" to look around:"); 
		
		String userInput = sc.nextLine().toLowerCase(); 	
		 
		do { 
			switch (userInput) {
				case "north":
					distanceFromTreasure = game.locationUpdate("north");
					break;
				case "south": 
					distanceFromTreasure = game.locationUpdate("south");
					break;
				case "east":
					distanceFromTreasure = game.locationUpdate("east");
					break;
				case "west":
					distanceFromTreasure = game.locationUpdate("west");
					break;
				case "look":
					System.out.println(game.surroundingsInformation());
					break;
				default:
					System.out.println("Your input is not recognised, please try again.");
			}
			
			if (distanceFromTreasure < 1) {	
				break;
			}
			else { 	
				System.out.println("The dial reads \'" + Math.round(distanceFromTreasure) + "m'");	//round w decimals?
				System.out.println("Try \"north\", \"south\", \"east\", or \"west\":");
				userInput = sc.nextLine().toLowerCase(); 
			}			
		}  while (userInput != ""); 
		
		System.out.println("You see a box sitting on the plain. Its filled with treasure! You win! \nThe end.");
		sc.close();
	}

}
