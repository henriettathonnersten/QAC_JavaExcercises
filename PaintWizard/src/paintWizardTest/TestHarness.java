package paintWizardTest;

import org.junit.Test;

public class TestHarness {
		
	@Test
	public void overAllTest() {
		PaintTest paintTest = new PaintTest();
		paintTest.existanceCheck();
		paintTest.getName();
		paintTest.setName();
		paintTest.getContent();
		paintTest.setContent();
		paintTest.getCost();
		paintTest.setCost();
		paintTest.getCoverPerLitre();
		paintTest.setCoverPerLitre();
		paintTest.getCoverage();
		paintTest.getNoOTinsNeeded();
		paintTest.getWaste();	
		
		PaintCalculatorTest calculatorTest = new PaintCalculatorTest();						
		calculatorTest.getLeastWaste();
		calculatorTest.getCheapestPaint();
	}

}
