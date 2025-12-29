
public class Time24hrs {
	
	public static void main(String[] args) {
		
		
//		
//		Accept time in 24-hour format and print:
//			0â€“11 â†’ Good Morning
//			12â€“16 â†’ Good Afternoon
//			17â€“20 â†’ Good Evening
//			21â€“23 â†’ Good Night
		
		int a = 4;
		if ( a <= 24) {
			if(a < 12) {
				System.out.println("The time is "+ a +" Am");
			}
			else {
				System.out.println("The time is "+ a+ " Pm");
			}
		}
		
		
		
		if( a > 0 && a <=11) {
			System.out.println("Good morning");
		}
		else if(a > 12 && a <= 16) {
			System.out.println("Good afternoon");
		}
		else if(a > 17 && a <=20 ) {
			System.out.println("Good Evening");
		}
		else if( a > 21 && a <= 23) {
			System.out.println("Good Night");
		}
		else {
			System.out.println("Enter the integer value between 1 to 24 and run the programm again.");
		}
		
		
		
		
	}

}
