package filesTest;

import static org.junit.Assert.*;

import org.junit.Test;
import filesCode.Person;

public class PersonTest {
	
	Person person = new Person("Alice", 52, "manager");
	
	@Test
	public void existanceCheck() {
		assertNotNull(person);
	}
	
	@Test 
	public void getName() {
		assertEquals("Person is not called Alice", "Alice", person.getName());
	}
	
	@Test 
	public void setName() {
		person.setName("Beatrice");
		assertEquals("Person is not called Beatrice", "Beatrice", person.getName());
	}
	
	@Test 
	public void getAge() {
		assertEquals("Person is not 52", 52, person.getAge());
	}
	
	@Test 
	public void setAge() {
		person.setAge(33);
		assertEquals("Person is not 33", 33, person.getAge());
	}

	@Test 
	public void getOccupation() {
		assertEquals("Person is not a manager", "manager", person.getOccupation());
	}
	
	@Test 
	public void setOccupation() {
		person.setOccupation("cashier");
		assertEquals("Person is not a cashier", "cashier", person.getOccupation());
	}
	
	@Test
	public void checkFileExistance() { //??????
		
	}
	
	@Test
	public void checkFileContent() {
		
	}
}
