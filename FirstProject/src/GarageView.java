import java.util.Scanner;

public class GarageView {
	public static void main(String[] args) {	
		
		Garage garage = new Garage();
		
		System.out.println("What do you want to do?"
							+ "\nFor calculating the total garage bill, press 0."
							+ "\nFor adding a vehicle, press 1."
							+ "\nFor removing a vehicle, press 2."
							+ "\nFor fixing a vehicle, press 3."
							+ "\nTo empty the garage, press 4.");
		
		Scanner sc = new Scanner(System.in);
		//TRY CATCH
		int selection = Integer.parseInt(sc.nextLine());
			
		switch (selection) {
			case 0: 
				garage.calculateBill();
				break;
			case 1: 
				System.out.println("Enter vehicle type: ");
				String type = sc.nextLine();
				System.out.println("Enter number of wheels: ");
				int noOfWheels = Integer.parseInt(sc.nextLine());
				System.out.println("Enter price of fixing the vehicle: ");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter the vehicle's fuel: ");
				String fuel = sc.nextLine();
				
				switch (type) {
					case "car":
					case "Car":
						System.out.println("Enter engine information: ");
						String carEngine = sc.nextLine();
						garage.addVehicle("car", noOfWheels, price, fuel, carEngine);
						break;
					case "motorcycle":
					case "Motorcycle":
						System.out.println("Enter engine information: ");
						String motorcycleEngine = sc.nextLine();
						garage.addVehicle("motorcycle", noOfWheels, price, fuel, motorcycleEngine);						
						break;
					case "cycle":
					case "Cycle":
						System.out.println("Enter number of pedals: ");
						int pedals = Integer.parseInt(sc.nextLine());
						garage.addCycle(noOfWheels, price, fuel, pedals);
						break;
					default:
						System.out.println("This garage does not handle your vehicle. Please choose another one.");
				}
				break;
			case 2: 
				System.out.println("To remove by ID, enter \"ID\". To remove by vehicle type, enter \"type\"."); 
				String removalType = sc.nextLine();
				
				switch (removalType) {
					case "ID":
					case "id":
						System.out.println("Enter the ID you want to remove: "); 
						int id = Integer.parseInt(sc.nextLine());						
						garage.removeByID(id);
						break;
					case "type":
						System.out.println("To remove all cars, enter \"car\". "
											+ "To remove all motorcycles, enter \"motorcycle\". "
											+ "To remove all cycles, enter \"cycle\"."); 
						String vehicleType = sc.nextLine();
						switch (vehicleType) {
						case "car":
						case "Car":
							garage.removeByVehicle(new Car());
							break;
						case "motorcycle":
						case "Motorcycle":
							garage.removeByVehicle(new Motorcycle());						
							break;
						case "cycle":
						case "Cycle":
							garage.removeByVehicle(new Cycle());
							break;
						default:
							System.out.println("This garage does not handle your vehicle. Please choose another one.");
							break;
						}
						break;
					default:
						System.out.println("Selection not recognised. Please try again.");
				}									
				break;
			case 3:
				System.out.println("To repair a car, enter \"car\". "
						+ "To repair a motorcycle, enter \"motorcycle\". "
						+ "To repair a cycle, enter \"cycle\"."); 
				String vehicleType = sc.nextLine();
				switch (vehicleType) {
					case "car":
					case "Car":
						garage.fixVehicle(new Car());
						break;
					case "motorcycle":
					case "Motorcycle":
						garage.fixVehicle(new Motorcycle());						
						break;
					case "cycle":
					case "Cycle":
						garage.fixVehicle(new Cycle());
						break;
					default:
						System.out.println("This garage cannot fix your vehicle. Please choose another one.");
						break;
				}
				break;
			case 4: 
				garage.emptyGarage();
				break;
			default:
				System.out.println("No selection. Please try again.");				
		}
	
	}

}