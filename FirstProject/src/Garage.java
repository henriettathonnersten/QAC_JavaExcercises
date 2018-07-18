import java.util.ArrayList;
import java.util.Arrays;

public class Garage {

	static int vehicleID = 4;	//starts with the first possible ID that is not used
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public Garage () {
		Car honda = new Car(4, 300.00, "petrol", 0, "loud");
		Motorcycle harley = new Motorcycle(2, 175.01, "electicity", 1, "tiny");
		Cycle cresent = new Cycle (2, 6.75, "air", 2, 2);
		Car honda2 = new Car(4, 300.00, "petrol", 0, "loud");
	
		vehicles.addAll(Arrays.asList(honda, harley, cresent, honda2));
	}
	
	public void calculateBill() {
		double total = 0.00;
	
		for (Vehicle i : vehicles) {
			total += i.billCalculation();
		}
	
		System.out.println("Thecurrent garage total is £" + total);
	}
	
	public void addVehicle(String type, int noOfWheels, double price, String fuel, String engine) {
		switch (type) {
			case "car":
				vehicles.add(new Car (noOfWheels, price, fuel, vehicleID, engine));
			case "motorcycle":
				vehicles.add(new Motorcycle (noOfWheels, price, fuel, vehicleID, engine));
		}
		vehicleID++;
		countVehicles();
	}
	
	public void addCycle(int noOfWheels, double price, String fuel, int noOfPedals) {
		vehicles.add(new Cycle (noOfWheels, price, fuel, vehicleID, noOfPedals));
		vehicleID++;
		countVehicles();
	}
	
	public void removeByID(int id) {
		for (Vehicle i : vehicles) {
			if (i.vehicleID == id) {
				vehicles.remove(i);
				i = null;
				//break;
			}
		}
		countVehicles();
	}
	
	public void removeByVehicle(String type) {
		if (type == "car") {			
			ArrayList<Car> carsToRemove = new ArrayList<Car>();
			
			for (Vehicle i : vehicles) {
				if (i instanceof Car) {
					carsToRemove.add((Car) i);
				}
			}
			vehicles.removeAll(carsToRemove);
		}
		else if (type == "motorcycle") {
			ArrayList<Motorcycle> motorcyclesToRemove = new ArrayList<Motorcycle>();
			for (Vehicle i : vehicles) {
				if (i instanceof Motorcycle) {
					motorcyclesToRemove.add((Motorcycle) i);

				}
			}
			vehicles.removeAll(motorcyclesToRemove);
		}
		else {
			ArrayList<Cycle> cyclesToRemove = new ArrayList<Cycle>();
			for (Vehicle i : vehicles) {
				if (i instanceof Cycle) {
					cyclesToRemove.add((Cycle) i);
				}
			}
			vehicles.removeAll(cyclesToRemove);
		}
		countVehicles();
	}
	
	public fixVehicle()
	
	public void emptyGarage() {
		vehicles.removeAll(vehicles);

		System.out.println("Garage has been emptied.");
		countVehicles();
	}
	
	public void countVehicles() {
		int totalNoOfVehicles = 0;
		for (Vehicle i : vehicles) 
			totalNoOfVehicles++;
		
		System.out.println("There is now " + totalNoOfVehicles + " vehicles in the garage.");
		
	}
		
	
}
