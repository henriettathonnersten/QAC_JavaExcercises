
public class Car extends Vehicle {

	String engine;
	
	public Car (int noOfWheels, double price, String fuel, int vehicleID, String engine) {
		this.noOfWheels = noOfWheels;
		this.price = price;
		this.fuel = fuel;
		this.vehicleID = vehicleID;
		this.engine = engine;
	}
	
	public String toString() {
		return "A car has " + noOfWheels + " wheels, a " + engine + " engine, and is fueled by " + fuel + ". It costs �" + price + ".";
	}	
	
	public double billCalculation() {
		if (fuel.equals("diesel") || fuel.equals("petrol")) {
			double nonElectricTax = 1.02;
			return price * nonElectricTax;
		}
		else 
			return price;
		
		
	}
	
}
