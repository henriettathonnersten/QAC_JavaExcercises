import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		/*BlackJack game = new BlackJack();	
		System.out.println(game.blackJackTest());*/
		
		/*UniqueSum uniqueCheck = new UniqueSum();
		System.out.println(uniqueCheck.check(62, 2, 62));*/
		
		/*SummerCheck isItSummer = new SummerCheck();
		System.out.println(isItSummer.summerCheck(95, false));*/
		
		Person person1 = new Person ("Sophie", 23, "student");
		Person person2 = new Person ("Mary", 53, "cook");
		Person person3 = new Person ("Cathy", 63, "teacher");
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.addAll(Arrays.asList(person1, person2, person3));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the name of who you are looking for:");
		
		String input = sc.nextLine();
		//System.out.print(input);
		
		sc.close();

		for (Person i : people) {
			if (input.equals(i.name)) {
				System.out.println(i.toString());
			}
		}
		
		
	}
}
