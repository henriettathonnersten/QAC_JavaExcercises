package codeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Doggo;

public class DoggoTest {
	@Test 
	public void test1() {
		int input = 21;
		Doggo dog = new Doggo(input);
		
		
		String expectedOutput = "";
		
		for (int i=1; i < 101; i++) {
			if (i != input) {
				String number = Integer.toString(i);
				char lastNumber = number.charAt(number.length()-1);
				
				switch (lastNumber) {
					case '1':						
						if (number.equals("11"))
							expectedOutput.concat(i + "th, ");
						else
							expectedOutput.concat(i + "st, ");
						break;
					case '2':
						if (number.equals("12"))
							expectedOutput.concat(i + "th, ");
						else
							expectedOutput.concat(i + "nd, ");
						break;
					case '3':
						if (number.equals("13"))
							expectedOutput.concat(i + "th, ");
						else
							expectedOutput.concat(i + "rd, ");
						break;

					default:  
						expectedOutput.concat(i + "th, ");
						break;
				}
			}
		}

		assertEquals("Your number was printed.", dog.printOutput(), expectedOutput);
	}
}
