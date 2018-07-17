
public class Cycle extends Vehicle {

	String vehicletype;
	int noOfPedals;
	
	public Cycle (int noOfWheels, double price, String fuel, String vehicleType, int noOfPedals) {
		this.noOfWheels = noOfWheels;
		this.price = price;
		this.fuel = fuel;
		this.noOfPedals = noOfPedals ;
	}
	
	public String toString() {
		return "A " + vehicletype + " has " + noOfWheels + " wheels, " + noOfPedals + " pedals, and is fueled by " + fuel + ". It costs £" + price + ".";
	}	
	
}
