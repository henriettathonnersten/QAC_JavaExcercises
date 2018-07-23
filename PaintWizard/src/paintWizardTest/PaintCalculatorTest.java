package paintWizardTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import paintWizard.PaintCalculator;

public class PaintCalculatorTest {
	
	PaintCalculator calculator = new PaintCalculator();
	
	@Test
	public void getLeastWaste() {
		assertEquals("The paint calculated to waste the least is not the one expected", "AverageJoes", calculator.leastWasteCheck(300));
	}
	
	@Test
	public void getCheapestPaint() {
		assertEquals("The calculated cheapest paint is not the one expected", "AverageJoes", calculator.cheapestCheck(300));
	}

}
