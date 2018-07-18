
public class Cycle extends Vehicle {

	int noOfPedals;
	
	public Cycle (int noOfWheels, double price, String fuel, int vehicleID, int noOfPedals) {
		this.noOfWheels = noOfWheels;
		this.price = price;
		this.fuel = fuel;
		this.vehicleID = vehicleID;
		this.noOfPedals = noOfPedals ;
	}
	
	public String toString() {
		return "A cycle has " + noOfWheels + " wheels, " + noOfPedals + " pedals, and is fueled by " + fuel + ". It costs £" + price + ".";
	}	
	
	@Override
	public double billCalculation() {
		double oilPricePerItem = 2;
		return (noOfPedals * oilPricePerItem) + (noOfWheels * oilPricePerItem); 
		
	}
}
