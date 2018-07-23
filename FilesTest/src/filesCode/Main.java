package filesCode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Person person0 = new Person("Alice", 52, "manager");
		Person person1 = new Person("Beatrice", 33, "cashier");
		Person person2 = new Person("Cecily", 26, "customer service");
		Person person3 = new Person("Diana", 50, "phone operator");
		Person person4 = new Person("Erica", 32, "manager");
		ArrayList<Person> persons = new ArrayList<Person>();		
		persons.addAll(Arrays.asList(person0, person1, person2, person3, person4));
		
		//writer/reader declaration
		// private static 
		final String FILENAME = "C:\\Users\\Admin\\Desktop\\QAC_JavaExcercises\\FilesTest\\file.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		//writes to file
		try {
			fw = new FileWriter(FILENAME);			
			bw = new BufferedWriter(fw);
			
			for (Person i : persons) {
				bw.write(i.getName() + "|" + i.getAge() + "|" + i.getOccupation());
				bw.newLine();
			}
			bw.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//reads from file
		ArrayList<Person> readInPersons = new ArrayList<Person>();
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			try {
				for (int i = 0; i < persons.size(); i++) {
					String personInfo = br.readLine();
					String[] info = personInfo.split("\\|");
					String name = info[0]; 
					int age = Integer.parseInt(info[1]); 
					String occupation = info[2];
										
					readInPersons.add(new Person(name, age, occupation));
				}
				
				for (Person p : readInPersons) { // outputs info stored in read in array
					System.out.println(p.getName() + " " + p.getAge() + " " + p.getOccupation());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
			 
	}

}
