package filesCode;

public class Person {

	private String name;
	private int age;
	private String occupation;
	
	public Person(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String newOccupation) {
		occupation = newOccupation;
	}
	
	
}
