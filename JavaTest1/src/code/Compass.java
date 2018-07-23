package code;

public class Compass {
	
	private Player player;
	
	public Compass(Player player) { 
		this.player = player;
	}
	
	public double getNewDistance() {		 
		double newDistance = 0.00;
		
		double playerHorizontal = checkNegative(player.getHorizontalLocation());
		double playerVertical = checkNegative(player.getVerticalLocation());

		newDistance = Math.sqrt(playerHorizontal * playerHorizontal + playerVertical * playerVertical);
				
		return newDistance;
	}
	
	//returns positive value, in case Player is south/west of treasure (negative number)
	public double checkNegative(double location) {
		if (location < 0)
			location = -location;
		
		return location;
	}

}
