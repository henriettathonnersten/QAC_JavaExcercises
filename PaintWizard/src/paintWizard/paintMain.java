package paintWizard;

import java.util.Scanner;

public class paintMain {

	public static void main(String[] args) {	
						
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the width of the room: ");
		double width = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the depth of the room: ");
		double depth = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the height of the room: ");
		double height = Double.parseDouble(sc.nextLine());
		
		sc.close();
		
		double wallArea = width * depth * height;
		
		PaintCalculator calculator = new PaintCalculator();
		System.out.println(calculator.leastWasteCheck(wallArea) + " wastes least paint.");
		System.out.println(calculator.cheapestCheck(wallArea) + " is the cheapest option.");
		
	}

}
