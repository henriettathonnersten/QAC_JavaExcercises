package konstYtest;

import org.junit.Test;

public class ReviewTest {

	Review review = new Review("henrietta@test.com", 5, "Magnificent etc");
	
	@Test 
	public void reviewExistanceCheck() {
		assertNotNull(review);
	}
	
	/*@Test
	public void getReviewer() {
		assertEquals("The reviewer is not the one expected", "henrietta@test.com", review.getReviewer());
	}
	
	@Test
	public void setReviewer() {
		review.setReviewer("hentho@test.co.uk");
		assertEquals("The reviewer is not the one expected", "hentho@test.co.uk", review.getReviewer());
	}*/
	
	@Test
	public void getSaleID() {
		assertEquals("The sale ID is not the one expected", 0, review.getSaleID());
	}
	
	@Test
	public void setSaleID() {
		review.setSaleID(13);
		assertEquals("The sale ID is not the one expected", 13, review.getSaleID());
	}
	
	@Test
	public void getRatingValue() {
		assertEquals("The rating value is not the one expected", 5, review.getRatingValue());
	}
	
	@Test
	public void setRatingValue() {
		review.setRatingValue(1);
		assertEquals("The rating value is not the one expected", 1, review.getRatingValue());
	}
	
	@Test
	public void getRatingText() {
		assertEquals("The rating is not the one expected", "Magnificent etc", review.getRatingText());
	}
	
	@Test
	public void setRatingText() {
		review.setRatingText("Utter shit etc");
		assertEquals("The rating is not the one expected", "Utter shit etc", review.getRatingText());
	}
}
