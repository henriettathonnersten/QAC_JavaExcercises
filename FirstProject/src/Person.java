
public class Person {
	String name;
	int age;
	String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return name + " is " + age + " years old and works as a " + jobTitle + ".";
	}	
	
	

}
