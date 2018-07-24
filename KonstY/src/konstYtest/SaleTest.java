package konstYtest;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import org.junit.Test;

public class SaleTest {
	
	LocalDateTime purchaseDateTime = LocalDateTime.of(2014, 4, 15, 11, 30);
	Sale sale = new Sale(0, "henrietta@test.com", 6, "CT1 2AW", purchaseDateTime, 5.99, 'O');
	
	@Test
	public void saleExistanceCheck() {
		assertNotNull(sale);
	}
	
	@Test
	public void getSaleID() {
		assertEquals("The sale ID is not the one expected", 0, sale.getSaleID());
	}
	
	@Test
	public void setSaleID() {
		sale.setSaleID(13);
		assertEquals("The sale ID is not the one expected", 13, sale.getSaleID());
	}

	@Test
	public void getItemID() {
		assertEquals("The item ID is not the one expected", 0, sale.getItemID());
	}
	
	@Test
	public void setItemID() {
		sale.setItemID(13);
		assertEquals("The item ID is not the one expected", 13, sale.getItemID());
	}
	
	@Test
	public void getBuyer() {
		assertEquals("The reviewer is not the one expected", "henrietta@test.com", sale.getReviewer());
	}
	
	@Test
	public void setBuyer() {
		sale.setReviewer("hentho@test.co.uk");
		assertEquals("The reviewer is not the one expected", "hentho@test.co.uk", sale.getReviewer());
	}
	
	@Test
	public void getHouseNumber() {
		assertEquals("House number is not the one expected", 6, sale.getHouseNumber());
	}
	
	@Test
	public void setHouseNumber() {
		sale.setHouseNumber(7);
		assertEquals("House number is not the one expected", 7, sale.getHouseNumber());
	}
	
	@Test
	public void getPostcode() {
		assertEquals("Postcode is not the one expected", "username", sale.getPostcode());
	}
	
	@Test
	public void setPostcode() {
		sale.setPostcode("M50 3YJ");
		assertEquals("Postcode is not the one expected", "M50 3YJ", sale.getPostcode());
	}
	
	//////
	
	@Test
	public void getPurchaseDateTime() {
		assertEquals("The date and time fo the purchase is not the one expected", purchaseDateTime, sale.getPurchaseDateTime());
	}
	
	@Test
	public void setPurchaseDateTime() {
		LocalDateTime newPurchaseDateTime = LocalDateTime.of(2018, 5, 31, 19, 30);
		sale.setPurchaseDateTime(newPurchaseDateTime);
		assertEquals("The date and time fo the purchase is not the one expected", newPurchaseDateTime, sale.getPurchaseDateTime());
	}
	saleDateTime date
	//////
	
	@Test
	public void getDeliveryPrice() {
		assertEquals("The item price is not the one expected", 5.99, sale.getDeliveryPrice(), 0.00);
	}
	
	@Test
	public void setDeliveryPrice() {
		sale.setDeliveryPrice(66.66);
		assertEquals("The item price is not the one expected", 66.66, sale.getDeliveryPrice(), 0.00);
	}
	
	@Test
	public void getDeliveryStatus() {
		assertEquals("The status is not the one expected", 'O', sale.getDeliveryStatus());
	}
	
	@Test
	public void setDeliveryStatus() {
		sale.setDeliveryStatus('S');
		assertEquals("The status is not the one expected", 'S', sale.getDeliveryStatus());
	}	

	@Test
	public void returnPriceInt() {
		assertEquals("The converted delivery price is not the one expected", 6666, sale.convertToInt(66.66), 0.00);
	}

}
