package paintWizardTest;

import static org.junit.Assert.*;
import org.junit.Test;
import paintWizard.Paint;

public class PaintTest {
	
	Paint paint = new Paint("CheapPaint", 10, 12.53, 50);
		
	@Test 
	public void existanceCheck() {
		assertNotNull(paint);
	}
	
	@Test 
	public void getName() {
		assertEquals("The paint is not called CheapPaint", "CheapPaint", paint.getName());
	}
	
	@Test 
	public void setName() {
		paint.setName("Cheapomax");
		assertEquals("The paint is not called Cheapomax", "Cheapomax", paint.getName());
	} 
	
	@Test 
	public void getContent() {
		assertSame("The paint cost is not what is expected", 10, paint.getContent());
	}
	
	@Test 
	public void setContent() {
		paint.setContent(20);
		assertSame("The paint cost is not what is expected", 20, paint.getContent());
	} 
	
	@Test 
	public void getCost() {
		assertEquals("The paint cost is not what is expected", 12.53, paint.getCost(), 0);
	}
	
	@Test 
	public void setCost() {
		paint.setCost(19.99);
		assertEquals("The paint cost is not what is expected", 19.99, paint.getCost(), 0);
	} 
	
	@Test 
	public void getCoverPerLitre() {
		assertSame("The paint cost is not what is expected", 50, paint.getCoverPerLitre());
	}
	
	@Test 
	public void setCoverPerLitre() {
		paint.setCoverPerLitre(10);
		assertSame("The paint cost is not what is expected", 10, paint.getCoverPerLitre());
	} 	
		
	@Test
	public void getCoverage() {
		paint.setContent(20);
		paint.setCoverPerLitre(10);
		 assertEquals("The coverage does not match the expected coverage", 200, paint.getCoverage());
	}
	
	@Test
	public void getNoOTinsNeeded() {
		paint.setContent(20);
		paint.setCoverPerLitre(10);
		 assertEquals("The number of tins does not match the expected number", 2, paint.getNoOfTins(300), 0);
	}
	
	@Test
	public void getWaste() {	
		paint.setContent(20);
		paint.setCoverPerLitre(10);
		assertEquals("The actual amount of waste does not match the expected waste", 10, paint.getWaste(2, 300), 0);
	}

}
