import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;

public class App {
/*	*/
	
	public int conditional (int a, int b, boolean c) {
		if (c)
			return a+b;
		else
			return a*b;
	} 
	
	public int conditional2 (int a, int b, boolean c) {
		if (a == 0)
			return b;
		else if (b == 0)
			return a;
		else {
			if (c)
				return a+b;
			else
			return a*b;
		}
	} 
	
	public void iteration (int a, boolean c) {
		int number1 = a;
		for (int i = 0; i < 10; i++) {
			if (c) {
				number1 += i;
				System.out.println(number1);
			}
			else {
				number1 *= i;
				System.out.println(number1);
			}
		}
	}
	
	public int arrays() {
		int arrayOfNumbers[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int a = ThreadLocalRandom.current().nextInt(0, 9 + 1);
		int b = ThreadLocalRandom.current().nextInt(0, 9 + 1);
		
		boolean c = false;
		if (a == 0)
			return b;
		else if (b == 0)
			return a;
		else {
			if (c)
				return a+b;
			else
			return a*b;
		}
	} 
	
	public void iterationArrays() {
		int arrayOfNumbers[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.println(arrayOfNumbers[i]);
		}

	}
	
	public void iterationArrays2() {
		int arrayOfAddedNumbers[] = new int[10];
		for (int i = 0; i < arrayOfAddedNumbers.length; i++) {
			arrayOfAddedNumbers[i] = ThreadLocalRandom.current().nextInt(0, arrayOfAddedNumbers.length+1);
			System.out.print(arrayOfAddedNumbers[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arrayOfAddedNumbers.length; i++) {
			arrayOfAddedNumbers[i] *= 10;
			System.out.print(arrayOfAddedNumbers[i] + " ");
		}
	}
}
