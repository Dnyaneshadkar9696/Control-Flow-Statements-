
public class IndustrySwitch {
	
	public static void main(String[] args) {
		
		// take industry ((Domestic, Commercial, Industrial) and print the electricity rate per 
//		unit using a switch case.
		
		String industryName = "Domestic";
		
		switch(industryName) {
		case "Domestic":
			System.out.println("The light rate for domestic use is 100Rs per unit.");
		    break;
		case "Commercial":
			System.out.println("The light rate for commercial use is 200Rs per unit.");
		    break;
		case "Industrial":
			System.out.println("The light rate for industrial use is 499Rs per unit.");
			break;
		default:
			System.out.println("Enter the proper industry name and run the programm again.");
		} 
		
	}

}
