package garageTest;

import static org.junit.Assert.*;
import org.junit.Test;

import Garage;

public class garageTest {
	
	//test av garage
	
	Garage garage = new Garage();
	
	@Test 
	public void garageExistanceCheck() {
		assertNotNull(garage);
	}
	
	@Test
	public void billCalculation() {
		assertEquals("The calculated bill is not the same as the expected bill", 676.0032, garage.calculateBill(), 0.0);
	}
	//car
	//cycle
	//motorcycle


}
