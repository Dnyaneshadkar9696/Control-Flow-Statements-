
public class EvenSwitch {
	
	public static void main(String[] args) {
		 // Check if a number is even or odd using switch case
		
		int number = 11; 

		switch (number % 2) {
			case 0:
				System.out.println("-> " + number + " is an even number.");
				break;
			case 1:
				System.out.println("-> " + number + " is an odd number.");
				break;
			default:
				System.out.println("-> Invalid input.");
		}
	}

}
