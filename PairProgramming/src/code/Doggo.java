package code;

public class Doggo {
	int input;

	public Doggo(int input) {
		this.input = input;
	}


	public String printOutput() {

		String expectedOutput = "";

		for (int i = 1; i < 101; i++) {
			if (input != i) {
				String number = Integer.toString(i);
				char lastNumber = number.charAt(number.length() - 1);

				switch (lastNumber) {
				case '1':
					if (number.equals("11")) {
						System.out.print(i + "th, ");
					}
					else {
						System.out.print(i + "st, ");
					}
					break;

				case '2':
					if (number.equals("12")) {
						System.out.print(i + "th, ");
					}
					else {
						System.out.print(i + "nd, ");
					}
					break;

				case '3':
					if (number.equals("13")) {
						System.out.print(i + "th, ");
					}
					else {
						System.out.print(i + "rd, ");
					}
					break;
					
				case '0':
					if (number.equals("100"))
						System.out.print(i + "th.");
					else 
						System.out.print(i + "th, \n");
					break;	
					
				default:
					System.out.print(i + "th, ");
					break;
				}
			}
		}
		
		return expectedOutput;
	}

}
