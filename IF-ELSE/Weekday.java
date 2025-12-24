import java.util.Scanner;;
public class Weekday {
	
	public static void main(String[] args) {
		
		// Write a program to print the day of the week based on day number (1 to 7).
		
		Scanner ns = new Scanner(System.in);{
		System.out.println("Enter the number form 1 to 7 to get the week day: ");
		int dayNum = ns.nextInt();
//		System.out.println(" ");
		if(dayNum > 7) {
			System.out.println("Eneter the right number and run the programm again.");
		}
		else {
		if(dayNum == 1) {
			System.out.println("->Monday");
		}
		else if(dayNum == 2) {
			System.out.println("->Tuesday");
		}
		else if(dayNum == 3) {
			System.out.println("->Wednesday");
		}

		else if(dayNum == 4) {
			System.out.println("->Thursday");
		}

		else if(dayNum == 5) {
			System.out.println("->Friday");
		}

		else if(dayNum == 6) {
			System.out.println("->Saturday");
		}

		else {
			System.out.println("->Sunday");
		}
		}

		}
	}

}
