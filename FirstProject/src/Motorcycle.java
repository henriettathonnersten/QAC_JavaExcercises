
public class Motorcycle extends Vehicle {

	String engine;
	
	public Motorcycle (int noOfWheels, double price, String fuel, int vehicleID, String engine) {
		this.noOfWheels = noOfWheels;
		this.price = price;
		this.fuel = fuel;
		this.vehicleID = vehicleID;
		this.engine = engine;
	}
	
	public String toString() {
		return "A motorcycle has " + noOfWheels + " wheels, a " + engine + " engine, and is fueled by " + fuel + ". It costs £" + price + ".";
	}	
	
	public double billCalculation() {
		double tax = price * 0.16;
		return tax * noOfWheels; 		
	}
	
}
