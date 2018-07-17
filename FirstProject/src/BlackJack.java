import java.util.concurrent.ThreadLocalRandom;

public class BlackJack {
	public int blackJackTest() {
		
		int number1 = ThreadLocalRandom.current().nextInt(0, 26+1);
		int number2 = ThreadLocalRandom.current().nextInt(0, 26+1);		
		System.out.println(number1);
		System.out.println(number2);
		
		if (number1 >= 21 && number2 >= 21)
			return 0;
		else if (number1 < 21 && number2 < 21) {
			if (number1 > number2)
				return number1;
			else
				return number2;			
		}
		else if (number1 >= 21)
			return number2;
		else 
			return number1;
			
	}
}
