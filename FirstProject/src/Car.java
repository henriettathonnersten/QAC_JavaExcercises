
public class Car extends Vehicle {
	String vehicletype;
	String engine;
	
	public Car (int noOfWheels, double price, String fuel, String vehicleType, String engine) {
		this.noOfWheels = noOfWheels;
		this.price = price;
		this.fuel = fuel;
		this.engine = engine;
	}
	
	public String toString() {
		return "A " + vehicletype + " has " + noOfWheels + " wheels, a " + engine + " engine, and is fueled by " + fuel + ". It costs £" + price + ".";
	}	
	
}
