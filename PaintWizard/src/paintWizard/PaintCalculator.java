package paintWizard;

import java.util.ArrayList;
import java.util.Arrays;

public class PaintCalculator {
	
	Paint cheapo = new Paint("CheapoMax", 20, 19.99, 10);
	Paint average = new Paint("AverageJoes", 15, 17.99, 11);
	Paint duluxourous = new Paint("DuluxourousPaints", 10, 25, 20);
	double waste[] = new double[3];
	double paintCost[] = new double[3];
	ArrayList<Paint> paints = new ArrayList<Paint>();
	
	
	public PaintCalculator() {
		paints.addAll(Arrays.asList(cheapo, average, duluxourous));						
	}
	
	public String leastWasteCheck(double wallArea) { //Work out which one wastes the least.
		
		double leastWasteLitres = 1000.00;
		int leastWaster = -1;
		
		for (int i = 0; i < paints.size(); i++) {
			int noOfTinsNeeded = paints.get(i).getNoOfTins(wallArea); 
			waste[i] = paints.get(i).getWaste(noOfTinsNeeded, wallArea);
		} 
						
		for (int i = 0; i < paints.size(); i++) {
			if (waste[i] < leastWasteLitres) {
				leastWaster = i;
				leastWasteLitres = waste[i]; 
			}
		}
		
		return paints.get(leastWaster).getName();		
	}
	
	public String cheapestCheck(double wallArea) { 
		
		double smallestCost = 1000.00;
		int cheapestPaint = -1;
		
		for (int i = 0; i < paints.size(); i++) { 
			int noOfTinsNeeded = paints.get(i).getNoOfTins(wallArea); 
			paintCost[i] = noOfTinsNeeded * paints.get(i).getCost();
		} 
						
		for (int i = 0; i < paints.size(); i++) { 
			if (paintCost[i] < smallestCost) {
				cheapestPaint = i;
				smallestCost = paintCost[i]; 
			}
		}
		
		return paints.get(cheapestPaint).getName();	
	}

}
