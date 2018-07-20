package paintWizard;

public class Paint {
	private String name;
	private int content;
	private double cost;
	private int coverPerLitre;
	
	public Paint(String name, int content, double cost, int coverPerLitre) {
		this.name = name;
		this.content = content;
		this.cost = cost;
		this.coverPerLitre = coverPerLitre;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getContent() {
		return content;
	}
	
	public void setContent(int newContent) {
		content = newContent;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost (double newCost) {
		cost = newCost;		
	}
	
	public int getCoverPerLitre() {
		return coverPerLitre;
	}
	
	public void setCoverPerLitre(int newCoverPerLitre) {
		coverPerLitre = newCoverPerLitre;
	}
	
	public int getCoverage() {
		return content * coverPerLitre;
	}
	
	public int getNoOfTins(double wallArea) {
		double tinsUsed = wallArea / (getCoverage());
		
		int tinsNeeded = 0;
		if (tinsUsed % 2 > 0)
			tinsNeeded = (int)Math.ceil(tinsUsed);
		else
			tinsNeeded = (int)Math.floor(tinsUsed);

		return tinsNeeded;
	} 
	
	public double getWaste(int noOfTinsNeeded, double wallArea) {
		double tinsWasted = noOfTinsNeeded - wallArea / getCoverage();
		
		double waste = tinsWasted * getContent();
		
		return waste;
	}

}
