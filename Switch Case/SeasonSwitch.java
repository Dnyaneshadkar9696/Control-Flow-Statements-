
public class SeasonSwitch {
	
	public static void main(String[] args) {
		
		// Take month number (1â€“12) and print the corresponding season
		//Decâ€“Feb â†’ Winter
//		Marâ€“May â†’ Summer
//		Junâ€“Aug â†’ Monsoon
//		Sepâ€“Nov â†’ Autumn
		
		int monthName = 6;
		
		//  based on the month number we have to print the season using switch case.
		
		switch(monthName) {
		case 12:
		case 1:	
		case 2:
			    // here we are using multiple cases and giving the one output if one of those cases match.
				System.out.println("-> Winter Season");
				break;
		case 3:
		case 4:
		case 5:
			    System.out.println("-> Summer Season");
			    break;
		case 6:
		case 7:
		case 8:
			   System.out.println("-> Monsoon Season");
			   break;
		case 9:
		case 10:
		case 11:
			   System.out.println("-> Autumn Season");
			   break;
		default:
				System.out.println("Enter the right number and run the program again.");									
												
		}
	}

}
