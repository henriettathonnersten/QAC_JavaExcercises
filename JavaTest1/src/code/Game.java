package code;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

	private Player player;
	private Compass compass;
	private ArrayList<Story> storyList = new ArrayList<Story>();
	
	public Game() {		
		player = new Player();
		compass = new Compass(player);		
		storyList.add(new Story(0, "Grey foggy clouds float oppressively close to you, \nreflected in the murky grey water which reaches up your shins."));
		storyList.add(new Story(1, "Some black plants barely poke out of the shallow water."));
		storyList.add(new Story(2, "The sky is getting darker. Looks like it might rain soon."));
		storyList.add(new Story(3, "All that is visible in any direction, is dark, grey water."));
		storyList.add(new Story(4, "Everything is completely quiet, apart from a low beeping sound."));
		storyList.add(new Story(5, "In the faraway distance, you can see a flock of birds flying away."));
	}
	
	public double locationUpdate(String direction) { 		
		double currentDistance = -100.00;
		
		switch (direction) {
			case "north": 
				player.move("V", 1);
				break;
			case "south":
				player.move("V", -1);
				break; 
			case "east":
				player.move("H", 1);
				break;
			case "west":
				player.move("H", -1);
				break;
		}
		
		currentDistance = compass.getNewDistance();		
		return currentDistance;	
	}
	
	// returns a random description of the surroundings 
	public String surroundingsInformation() { 
		int storyID = ThreadLocalRandom.current().nextInt(0, storyList.size()+1);
		return storyList.get(storyID).getOutput();
	}
	
}
