package code;

import java.util.concurrent.ThreadLocalRandom;

public class Player {

	private double locationHorizontal;
	private double locationVertical;
	
	public Player() { 
		setHorizontalLocation(ThreadLocalRandom.current().nextDouble(-10, 10+1));
		setVerticalLocation(ThreadLocalRandom.current().nextDouble(-10, 10+1)); 
	}
	
	public double getHorizontalLocation() { 
		return locationHorizontal;
	}
	
	public void setHorizontalLocation(double newDistance) {
		locationHorizontal = newDistance;
	}
	
	public double getVerticalLocation() {
		return locationVertical;
	}
	
	public void setVerticalLocation (double newDistance) {
		locationVertical = newDistance;
	}
	
	public double move(String direction, int move) {		
		if (direction.equals("H")) {
			locationHorizontal += move;
			return locationHorizontal;
		}
		else {
			locationVertical += move;
			return locationVertical;
		}
	}
}
